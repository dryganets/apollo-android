package com.example.scalar_types;

import com.apollostack.api.GraphQLOperation;
import com.apollostack.api.GraphQLQuery;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

public final class TestQuery implements GraphQLQuery<GraphQLOperation.Variables> {
  public static final String OPERATION_DEFINITION = "";

  public static final String QUERY_DOCUMENT = OPERATION_DEFINITION;

  private final GraphQLOperation.Variables variables;

  public TestQuery() {
    this.variables = GraphQLOperation.EMPTY_VARIABLES;
  }

  @Override
  public String queryDocument() {
    return QUERY_DOCUMENT;
  }

  @Override
  public GraphQLOperation.Variables variables() {
    return variables;
  }

  public interface Data extends GraphQLOperation.Data {
    @Nullable String graphQlString();

    @Nullable Long graphQlIdNullable();

    long graphQlIdNonNullable();

    @Nullable Integer graphQlIntNullable();

    int graphQlIntNonNullable();

    @Nullable Double graphQlFloatNullable();

    double graphQlFloatNonNullable();

    @Nullable Boolean graphQlBooleanNullable();

    boolean graphQlBooleanNonNullable();

    @Nullable List<Integer> graphQlListOfInt();

    @Nullable List<GraphQlListOfObject> graphQlListOfObjects();

    @Nullable List<List<Integer>> graphQlNestedList();

    interface GraphQlListOfObject {
      int someField();
    }
  }
}