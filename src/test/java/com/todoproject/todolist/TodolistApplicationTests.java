package com.todoproject.todolist;

import com.todoproject.todolist.entity.ToDo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.reactive.server.WebTestClient;

import static com.todoproject.todolist.ConstantsTest.TODOS;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Sql("/remove.sql")
class TodolistApplicationTests {

	@Autowired
	private WebTestClient webTestClient;



	@Test
	void testCreateToDoSuccess() {
		var todo = new ToDo("todo 1 nome", "todo 1 descricao", false, 1);

		webTestClient
				.post()
				.uri("/todos")
				.bodyValue(todo)
				.exchange()
				.expectStatus().isOk()
				.expectBody()
				.jsonPath("$").isArray()
				.jsonPath("$.length()").isEqualTo(1)
				.jsonPath("$[0].nome").isEqualTo(todo.getNome())
				.jsonPath("$[0].descricao").isEqualTo(todo.getDescricao())
				.jsonPath("$[0].realizado").isEqualTo(todo.isRealizado())
				.jsonPath("$[0].prioridade").isEqualTo(todo.getPrioridade());
	}


	@Test
	void testCreateToDoFailure() {
		var todo = new ToDo("", "", false, 0);

		webTestClient
				.post()
				.uri("/todos")
				.bodyValue(todo)
				.exchange()
				.expectStatus().isBadRequest();

	}


	@Sql("/import.sql")
	@Test
	public void testListToDoSuccess() {
		//System.out.println(TODOS.get(0));


		webTestClient
				.get()
				.uri("/todos")
				.exchange()
				.expectStatus().isOk()
				.expectBody()
				.jsonPath("$").isArray()
				.jsonPath("$.length()").isEqualTo(5)
				.jsonPath("$[1]").isEqualTo(TODOS.get(0))
				.jsonPath("$[2]").isEqualTo(TODOS.get(4))
				.jsonPath("$[3]").isEqualTo(TODOS.get(1))
				.jsonPath("$[4]").isEqualTo(TODOS.get(2))
				.jsonPath("$[0]").isEqualTo(TODOS.get(3));
	}


	@Test
	public void testUpdateToDoSuccess() {

	}


	@Test
	public void testUpdateToDoFailure() {

	}

}
