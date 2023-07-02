.class public final Lg7/f$b;
.super Lcom/google/protobuf/y$a;
.source ""

# interfaces
.implements Lcom/google/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg7/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/y$a<",
        "Lg7/f;",
        "Lg7/f$b;",
        ">;",
        "Lcom/google/protobuf/t0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lg7/f;->R()Lg7/f;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/y$a;-><init>(Lcom/google/protobuf/y;)V

    return-void
.end method

.method synthetic constructor <init>(Lg7/f$a;)V
    .locals 0

    invoke-direct {p0}, Lg7/f$b;-><init>()V

    return-void
.end method


# virtual methods
.method public L(I)Lg7/f$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/f;

    invoke-static {v0, p1}, Lg7/f;->U(Lg7/f;I)V

    return-object p0
.end method

.method public M(I)Lg7/f$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/f;

    invoke-static {v0, p1}, Lg7/f;->S(Lg7/f;I)V

    return-object p0
.end method

.method public N(I)Lg7/f$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/f;

    invoke-static {v0, p1}, Lg7/f;->T(Lg7/f;I)V

    return-object p0
.end method
