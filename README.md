# README

## Environment

java 11
Maven 3.5+



# Reference

- [Getting Started with GraphQL and Spring Boot](https://www.baeldung.com/spring-graphql)
- [Expose GraphQL Field with Different Name](https://www.baeldung.com/graphql-field-name)
- [Error Handling in GraphQL With Spring Boot](https://www.baeldung.com/spring-graphql-error-handling)
- [How to Test GraphQL Using Postman](https://www.baeldung.com/graphql-postman)
- [GraphQL vs REST](https://www.baeldung.com/graphql-vs-rest)
- [REST vs. GraphQL vs. gRPC – Which API to Choose?](https://www.baeldung.com/rest-vs-graphql-vs-grpc)

### GraphQL sample queries

Query
```shell script
curl \
--request POST 'localhost:8080/graphql' \
--header 'Content-Type: application/json' \
--data-raw '{"query":"query {\n    recentPosts(count: 2, offset: 0) {\n        id\n        title\n        author {\n            id\n            posts {\n                id\n            }\n        }\n    }\n}"}'
```

Mutation
```shell script
curl \
--request POST 'localhost:8080/graphql' \
--header 'Content-Type: application/json' \
--data-raw '{"query":"mutation {\n    createPost(title: \"New Title\", authorId: \"Author2\", text: \"New Text\") {\n id\n       category\n        author {\n            id\n            name\n        }\n    }\n}"}'
```

Test Mutations through altaire plugin
```
mutation {
  addPost(
    title: "string"
    text: "string"
    category: "string"
    authorId: "Author0"
  ) {
    id
    title
    text
    category
    author {
      id
      name
      thumbnail
    }
    first_author {
      id
      name
      thumbnail
    }
  }
}

```
