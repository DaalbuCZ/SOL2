.class public final Lg7/g$b;
.super Lcom/google/protobuf/y$a;
.source ""

# interfaces
.implements Lcom/google/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg7/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/y$a<",
        "Lg7/g;",
        "Lg7/g$b;",
        ">;",
        "Lcom/google/protobuf/t0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lg7/g;->R()Lg7/g;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/y$a;-><init>(Lcom/google/protobuf/y;)V

    return-void
.end method

.method synthetic constructor <init>(Lg7/g$a;)V
    .locals 0

    invoke-direct {p0}, Lg7/g$b;-><init>()V

    return-void
.end method


# virtual methods
.method public L(Lg7/b;)Lg7/g$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/g;

    invoke-static {v0, p1}, Lg7/g;->T(Lg7/g;Lg7/b;)V

    return-object p0
.end method

.method public M(Lg7/e;)Lg7/g$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/g;

    invoke-static {v0, p1}, Lg7/g;->V(Lg7/g;Lg7/e;)V

    return-object p0
.end method

.method public N(Lg7/f;)Lg7/g$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/g;

    invoke-static {v0, p1}, Lg7/g;->U(Lg7/g;Lg7/f;)V

    return-object p0
.end method

.method public O(Ljava/lang/String;)Lg7/g$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/g;

    invoke-static {v0, p1}, Lg7/g;->S(Lg7/g;Ljava/lang/String;)V

    return-object p0
.end method
