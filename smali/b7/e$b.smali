.class public final Lb7/e$b;
.super Lcom/google/protobuf/y$a;
.source ""

# interfaces
.implements Lcom/google/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb7/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/y$a<",
        "Lb7/e;",
        "Lb7/e$b;",
        ">;",
        "Lcom/google/protobuf/t0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lb7/e;->R()Lb7/e;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/y$a;-><init>(Lcom/google/protobuf/y;)V

    return-void
.end method

.method synthetic constructor <init>(Lb7/e$a;)V
    .locals 0

    invoke-direct {p0}, Lb7/e$b;-><init>()V

    return-void
.end method


# virtual methods
.method public L(J)Lb7/e$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lb7/e;

    invoke-static {v0, p1, p2}, Lb7/e;->S(Lb7/e;J)V

    return-object p0
.end method

.method public M(J)Lb7/e$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lb7/e;

    invoke-static {v0, p1, p2}, Lb7/e;->U(Lb7/e;J)V

    return-object p0
.end method

.method public N(J)Lb7/e$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lb7/e;

    invoke-static {v0, p1, p2}, Lb7/e;->T(Lb7/e;J)V

    return-object p0
.end method
