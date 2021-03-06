// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.zarinpal.test

import com.apollographql.apollo.api.Input
import com.apollographql.apollo.api.Operation
import com.apollographql.apollo.api.OperationName
import com.apollographql.apollo.api.Query
import com.apollographql.apollo.api.Response
import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.ScalarTypeAdapters
import com.apollographql.apollo.api.ScalarTypeAdapters.Companion.DEFAULT
import com.apollographql.apollo.api.`internal`.InputFieldMarshaller
import com.apollographql.apollo.api.`internal`.OperationRequestBodyComposer
import com.apollographql.apollo.api.`internal`.QueryDocumentMinifier
import com.apollographql.apollo.api.`internal`.ResponseFieldMapper
import com.apollographql.apollo.api.`internal`.ResponseFieldMarshaller
import com.apollographql.apollo.api.`internal`.ResponseReader
import com.apollographql.apollo.api.`internal`.SimpleOperationResponseParser
import com.apollographql.apollo.api.`internal`.Throws
import com.zarinpal.test.type.CustomType
import kotlin.Any
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.Transient
import okio.Buffer
import okio.BufferedSource
import okio.ByteString
import okio.IOException

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter")
public data class GetRepositoriesQuery(
  public val page: Input<Int> = Input.absent()
) : Query<GetRepositoriesQuery.Data, GetRepositoriesQuery.Data, Operation.Variables> {
  @Transient
  private val variables: Operation.Variables = object : Operation.Variables() {
    public override fun valueMap(): Map<String, Any?> = mutableMapOf<String, Any?>().apply {
      if (this@GetRepositoriesQuery.page.defined) {
        this["page"] = this@GetRepositoriesQuery.page.value
      }
    }

    public override fun marshaller(): InputFieldMarshaller = InputFieldMarshaller.invoke { writer ->
      if (this@GetRepositoriesQuery.page.defined) {
        writer.writeInt("page", this@GetRepositoriesQuery.page.value)
      }
    }
  }

  public override fun operationId(): String = OPERATION_ID

  public override fun queryDocument(): String = QUERY_DOCUMENT

  public override fun wrapData(`data`: Data?): Data? = data

  public override fun variables(): Operation.Variables = variables

  public override fun name(): OperationName = OPERATION_NAME

  public override fun responseFieldMapper(): ResponseFieldMapper<Data> =
      ResponseFieldMapper.invoke {
    Data(it)
  }

  @Throws(IOException::class)
  public override fun parse(source: BufferedSource, scalarTypeAdapters: ScalarTypeAdapters):
      Response<Data> = SimpleOperationResponseParser.parse(source, this, scalarTypeAdapters)

  @Throws(IOException::class)
  public override fun parse(byteString: ByteString, scalarTypeAdapters: ScalarTypeAdapters):
      Response<Data> = parse(Buffer().write(byteString), scalarTypeAdapters)

  @Throws(IOException::class)
  public override fun parse(source: BufferedSource): Response<Data> = parse(source, DEFAULT)

  @Throws(IOException::class)
  public override fun parse(byteString: ByteString): Response<Data> = parse(byteString, DEFAULT)

  public override fun composeRequestBody(scalarTypeAdapters: ScalarTypeAdapters): ByteString =
      OperationRequestBodyComposer.compose(
    operation = this,
    autoPersistQueries = false,
    withQueryDocument = true,
    scalarTypeAdapters = scalarTypeAdapters
  )

  public override fun composeRequestBody(): ByteString = OperationRequestBodyComposer.compose(
    operation = this,
    autoPersistQueries = false,
    withQueryDocument = true,
    scalarTypeAdapters = DEFAULT
  )

  public override fun composeRequestBody(
    autoPersistQueries: Boolean,
    withQueryDocument: Boolean,
    scalarTypeAdapters: ScalarTypeAdapters
  ): ByteString = OperationRequestBodyComposer.compose(
    operation = this,
    autoPersistQueries = autoPersistQueries,
    withQueryDocument = withQueryDocument,
    scalarTypeAdapters = scalarTypeAdapters
  )

  public data class Info(
    public val __typename: String = "Info",
    public val pages: Int?
  ) {
    public fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller.invoke { writer ->
      writer.writeString(RESPONSE_FIELDS[0], this@Info.__typename)
      writer.writeInt(RESPONSE_FIELDS[1], this@Info.pages)
    }

    public companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField.forString("__typename", "__typename", null, false, null),
          ResponseField.forInt("pages", "pages", null, true, null)
          )

      public operator fun invoke(reader: ResponseReader): Info = reader.run {
        val __typename = readString(RESPONSE_FIELDS[0])!!
        val pages = readInt(RESPONSE_FIELDS[1])
        Info(
          __typename = __typename,
          pages = pages
        )
      }

      @Suppress("FunctionName")
      public fun Mapper(): ResponseFieldMapper<Info> = ResponseFieldMapper { invoke(it) }
    }
  }

  public data class Result(
    public val __typename: String = "Character",
    public val id: String?,
    public val name: String?,
    public val image: String?
  ) {
    public fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller.invoke { writer ->
      writer.writeString(RESPONSE_FIELDS[0], this@Result.__typename)
      writer.writeCustom(RESPONSE_FIELDS[1] as ResponseField.CustomTypeField, this@Result.id)
      writer.writeString(RESPONSE_FIELDS[2], this@Result.name)
      writer.writeString(RESPONSE_FIELDS[3], this@Result.image)
    }

    public companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField.forString("__typename", "__typename", null, false, null),
          ResponseField.forCustomType("id", "id", null, true, CustomType.ID, null),
          ResponseField.forString("name", "name", null, true, null),
          ResponseField.forString("image", "image", null, true, null)
          )

      public operator fun invoke(reader: ResponseReader): Result = reader.run {
        val __typename = readString(RESPONSE_FIELDS[0])!!
        val id = readCustomType<String>(RESPONSE_FIELDS[1] as ResponseField.CustomTypeField)
        val name = readString(RESPONSE_FIELDS[2])
        val image = readString(RESPONSE_FIELDS[3])
        Result(
          __typename = __typename,
          id = id,
          name = name,
          image = image
        )
      }

      @Suppress("FunctionName")
      public fun Mapper(): ResponseFieldMapper<Result> = ResponseFieldMapper { invoke(it) }
    }
  }

  public data class Characters(
    public val __typename: String = "Characters",
    public val info: Info?,
    public val results: List<Result?>?
  ) {
    public fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller.invoke { writer ->
      writer.writeString(RESPONSE_FIELDS[0], this@Characters.__typename)
      writer.writeObject(RESPONSE_FIELDS[1], this@Characters.info?.marshaller())
      writer.writeList(RESPONSE_FIELDS[2], this@Characters.results) { value, listItemWriter ->
        value?.forEach { value ->
          listItemWriter.writeObject(value?.marshaller())}
      }
    }

    public companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField.forString("__typename", "__typename", null, false, null),
          ResponseField.forObject("info", "info", null, true, null),
          ResponseField.forList("results", "results", null, true, null)
          )

      public operator fun invoke(reader: ResponseReader): Characters = reader.run {
        val __typename = readString(RESPONSE_FIELDS[0])!!
        val info = readObject<Info>(RESPONSE_FIELDS[1]) { reader ->
          Info(reader)
        }
        val results = readList<Result>(RESPONSE_FIELDS[2]) { reader ->
          reader.readObject<Result> { reader ->
            Result(reader)
          }
        }
        Characters(
          __typename = __typename,
          info = info,
          results = results
        )
      }

      @Suppress("FunctionName")
      public fun Mapper(): ResponseFieldMapper<Characters> = ResponseFieldMapper { invoke(it) }
    }
  }

  /**
   * Data from the response after executing this GraphQL operation
   */
  public data class Data(
    public val characters: Characters?
  ) : Operation.Data {
    public override fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller.invoke {
        writer ->
      writer.writeObject(RESPONSE_FIELDS[0], this@Data.characters?.marshaller())
    }

    public companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField.forObject("characters", "characters", mapOf<String, Any>(
            "page" to mapOf<String, Any>(
              "kind" to "Variable",
              "variableName" to "page")), true, null)
          )

      public operator fun invoke(reader: ResponseReader): Data = reader.run {
        val characters = readObject<Characters>(RESPONSE_FIELDS[0]) { reader ->
          Characters(reader)
        }
        Data(
          characters = characters
        )
      }

      @Suppress("FunctionName")
      public fun Mapper(): ResponseFieldMapper<Data> = ResponseFieldMapper { invoke(it) }
    }
  }

  public companion object {
    public const val OPERATION_ID: String =
        "ec6d67d3dcc101828ffb613475f664e22e760faea9c0afac7009c39e1bc50c12"

    public val QUERY_DOCUMENT: String = QueryDocumentMinifier.minify(
          """
          |query GetRepositories(${'$'}page: Int) {
          |  characters(page: ${'$'}page) {
          |    __typename
          |    info {
          |      __typename
          |      pages
          |    }
          |    results {
          |      __typename
          |      id
          |      name
          |      image
          |    }
          |  }
          |}
          """.trimMargin()
        )

    public val OPERATION_NAME: OperationName = object : OperationName {
      public override fun name(): String = "GetRepositories"
    }
  }
}
