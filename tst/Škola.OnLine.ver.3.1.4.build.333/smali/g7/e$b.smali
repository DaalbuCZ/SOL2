.class public final Lg7/e$b;
.super Lcom/google/protobuf/y$a;
.source ""

# interfaces
.implements Lcom/google/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg7/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/y$a<",
        "Lg7/e;",
        "Lg7/e$b;",
        ">;",
        "Lcom/google/protobuf/t0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lg7/e;->R()Lg7/e;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/y$a;-><init>(Lcom/google/protobuf/y;)V

    return-void
.end method

.method synthetic constructor <init>(Lg7/e$a;)V
    .locals 0

    invoke-direct {p0}, Lg7/e$b;-><init>()V

    return-void
.end method


# virtual methods
.method public L(J)Lg7/e$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/e;

    invoke-static {v0, p1, p2}, Lg7/e;->S(Lg7/e;J)V

    return-object p0
.end method

.method public M(J)Lg7/e$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/e;

    invoke-static {v0, p1, p2}, Lg7/e;->U(Lg7/e;J)V

    return-object p0
.end method

.method public N(J)Lg7/e$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/e;

    invoke-static {v0, p1, p2}, Lg7/e;->T(Lg7/e;J)V

    return-object p0
.end method
