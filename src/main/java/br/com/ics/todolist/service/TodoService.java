package br.com.ics.todolist.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.ics.todolist.entity.Todo;
import br.com.ics.todolist.repository.TodoRepository;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @SuppressWarnings("null")
    public List<Todo> create(Todo todo) {
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> list() {
        Sort sort = Sort.by("priority").descending().and(
                Sort.by("name").ascending());
        return todoRepository.findAll(sort);
    }

    @SuppressWarnings("null")
    public List<Todo> update(Todo todo) {
        todoRepository.save(todo);
        return list();

    }

    @SuppressWarnings("null")
    public List<Todo> delete(Long id) {
        todoRepository.deleteById(id);
        return list();
    }
}