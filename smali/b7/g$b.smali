.class public final Lb7/g$b;
.super Lcom/google/protobuf/y$a;
.source ""

# interfaces
.implements Lcom/google/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb7/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/y$a<",
        "Lb7/g;",
        "Lb7/g$b;",
        ">;",
        "Lcom/google/protobuf/t0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lb7/g;->R()Lb7/g;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/y$a;-><init>(Lcom/google/protobuf/y;)V

    return-void
.end method

.method synthetic constructor <init>(Lb7/g$a;)V
    .locals 0

    invoke-direct {p0}, Lb7/g$b;-><init>()V

    return-void
.end method


# virtual methods
.method public L(Lb7/b;)Lb7/g$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lb7/g;

    invoke-static {v0, p1}, Lb7/g;->T(Lb7/g;Lb7/b;)V

    return-object p0
.end method

.method public M(Lb7/e;)Lb7/g$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lb7/g;

    invoke-static {v0, p1}, Lb7/g;->V(Lb7/g;Lb7/e;)V

    return-object p0
.end method

.method public N(Lb7/f;)Lb7/g$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lb7/g;

    invoke-static {v0, p1}, Lb7/g;->U(Lb7/g;Lb7/f;)V

    return-object p0
.end method

.method public O(Ljava/lang/String;)Lb7/g$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lb7/g;

    invoke-static {v0, p1}, Lb7/g;->S(Lb7/g;Ljava/lang/String;)V

    return-object p0
.end method
