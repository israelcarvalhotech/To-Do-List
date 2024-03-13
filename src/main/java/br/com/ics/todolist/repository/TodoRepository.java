package br.com.ics.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ics.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}