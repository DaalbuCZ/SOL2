.class Lcom/google/protobuf/h$a;
.super Lcom/google/protobuf/h$c;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/protobuf/h;->D()Lcom/google/protobuf/h$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private n:I

.field private final o:I

.field final synthetic p:Lcom/google/protobuf/h;


# direct methods
.method constructor <init>(Lcom/google/protobuf/h;)V
    .locals 1

    iput-object p1, p0, Lcom/google/protobuf/h$a;->p:Lcom/google/protobuf/h;

    invoke-direct {p0}, Lcom/google/protobuf/h$c;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/h$a;->n:I

    invoke-virtual {p1}, Lcom/google/protobuf/h;->size()I

    move-result p1

    iput p1, p0, Lcom/google/protobuf/h$a;->o:I

    return-void
.end method


# virtual methods
.method public e()B
    .locals 2

    iget v0, p0, Lcom/google/protobuf/h$a;->n:I

    iget v1, p0, Lcom/google/protobuf/h$a;->o:I

    if-ge v0, v1, :cond_0

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/google/protobuf/h$a;->n:I

    iget-object v1, p0, Lcom/google/protobuf/h$a;->p:Lcom/google/protobuf/h;

    invoke-virtual {v1, v0}, Lcom/google/protobuf/h;->x(I)B

    move-result v0

    return v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public hasNext()Z
    .locals 2

    iget v0, p0, Lcom/google/protobuf/h$a;->n:I

    iget v1, p0, Lcom/google/protobuf/h$a;->o:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
