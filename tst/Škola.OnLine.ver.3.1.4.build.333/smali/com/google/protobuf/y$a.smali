.class public abstract Lcom/google/protobuf/y$a;
.super Lcom/google/protobuf/a$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/protobuf/y<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lcom/google/protobuf/y$a<",
        "TMessageType;TBuilderType;>;>",
        "Lcom/google/protobuf/a$a<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# instance fields
.field private final n:Lcom/google/protobuf/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TMessageType;"
        }
    .end annotation
.end field

.field protected o:Lcom/google/protobuf/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TMessageType;"
        }
    .end annotation
.end field

.field protected p:Z


# direct methods
.method protected constructor <init>(Lcom/google/protobuf/y;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/protobuf/a$a;-><init>()V

    iput-object p1, p0, Lcom/google/protobuf/y$a;->n:Lcom/google/protobuf/y;

    sget-object v0, Lcom/google/protobuf/y$f;->q:Lcom/google/protobuf/y$f;

    invoke-virtual {p1, v0}, Lcom/google/protobuf/y;->A(Lcom/google/protobuf/y$f;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/protobuf/y;

    iput-object p1, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/protobuf/y$a;->p:Z

    return-void
.end method

.method private K(Lcom/google/protobuf/y;Lcom/google/protobuf/y;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;TMessageType;)V"
        }
    .end annotation

    invoke-static {}, Lcom/google/protobuf/d1;->a()Lcom/google/protobuf/d1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/d1;->e(Ljava/lang/Object;)Lcom/google/protobuf/h1;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/h1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final C()Lcom/google/protobuf/y;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->D()Lcom/google/protobuf/y;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/y;->t()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lcom/google/protobuf/a$a;->B(Lcom/google/protobuf/s0;)Lcom/google/protobuf/n1;

    move-result-object v0

    throw v0
.end method

.method public D()Lcom/google/protobuf/y;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/google/protobuf/y$a;->p:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    invoke-virtual {v0}, Lcom/google/protobuf/y;->J()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/protobuf/y$a;->p:Z

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    return-object v0
.end method

.method public E()Lcom/google/protobuf/y$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TBuilderType;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->H()Lcom/google/protobuf/y;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/y;->M()Lcom/google/protobuf/y$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->D()Lcom/google/protobuf/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/y$a;->J(Lcom/google/protobuf/y;)Lcom/google/protobuf/y$a;

    return-object v0
.end method

.method protected final F()V
    .locals 1

    iget-boolean v0, p0, Lcom/google/protobuf/y$a;->p:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->G()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/protobuf/y$a;->p:Z

    :cond_0
    return-void
.end method

.method protected G()V
    .locals 2

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    sget-object v1, Lcom/google/protobuf/y$f;->q:Lcom/google/protobuf/y$f;

    invoke-virtual {v0, v1}, Lcom/google/protobuf/y;->A(Lcom/google/protobuf/y$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/y;

    iget-object v1, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    invoke-direct {p0, v0, v1}, Lcom/google/protobuf/y$a;->K(Lcom/google/protobuf/y;Lcom/google/protobuf/y;)V

    iput-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    return-void
.end method

.method public H()Lcom/google/protobuf/y;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/protobuf/y$a;->n:Lcom/google/protobuf/y;

    return-object v0
.end method

.method protected I(Lcom/google/protobuf/y;)Lcom/google/protobuf/y$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)TBuilderType;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/protobuf/y$a;->J(Lcom/google/protobuf/y;)Lcom/google/protobuf/y$a;

    move-result-object p1

    return-object p1
.end method

.method public J(Lcom/google/protobuf/y;)Lcom/google/protobuf/y$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)TBuilderType;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    invoke-direct {p0, v0, p1}, Lcom/google/protobuf/y$a;->K(Lcom/google/protobuf/y;Lcom/google/protobuf/y;)V

    return-object p0
.end method

.method public bridge synthetic a()Lcom/google/protobuf/s0;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->C()Lcom/google/protobuf/y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->E()Lcom/google/protobuf/y$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f()Lcom/google/protobuf/s0;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->H()Lcom/google/protobuf/y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic p()Lcom/google/protobuf/s0;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->D()Lcom/google/protobuf/y;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic z(Lcom/google/protobuf/a;)Lcom/google/protobuf/a$a;
    .locals 0

    check-cast p1, Lcom/google/protobuf/y;

    invoke-virtual {p0, p1}, Lcom/google/protobuf/y$a;->I(Lcom/google/protobuf/y;)Lcom/google/protobuf/y$a;

    move-result-object p1

    return-object p1
.end method
