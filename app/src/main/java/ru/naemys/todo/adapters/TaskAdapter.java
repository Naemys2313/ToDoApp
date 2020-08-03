package ru.naemys.todo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ru.naemys.todo.R;
import ru.naemys.todo.models.Task;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.TaskViewHolder> {

    private Context context;
    private List<Task> tasks;

    public TaskAdapter(Context context, List<Task> tasks) {
        this.context = context;
        this.tasks = tasks;
    }

    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(context)
                .inflate(R.layout.note_item, parent, false);
        return new TaskViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {
        Task task = tasks.get(position);

        holder.taskCompleteCheckbox.setText(task.getTitle());
        holder.taskCompleteCheckbox.setChecked(task.isComplete());
    }

    @Override
    public int getItemCount() {
        return tasks.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    static class TaskViewHolder extends RecyclerView.ViewHolder {

        CheckBox taskCompleteCheckbox;

        public TaskViewHolder(@NonNull View itemView) {
            super(itemView);
            taskCompleteCheckbox = itemView.findViewById(R.id.task_complete_checkbox);
        }
    }
}
