.class public final Lb7/f$b;
.super Lcom/google/protobuf/y$a;
.source ""

# interfaces
.implements Lcom/google/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb7/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/y$a<",
        "Lb7/f;",
        "Lb7/f$b;",
        ">;",
        "Lcom/google/protobuf/t0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lb7/f;->R()Lb7/f;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/y$a;-><init>(Lcom/google/protobuf/y;)V

    return-void
.end method

.method synthetic constructor <init>(Lb7/f$a;)V
    .locals 0

    invoke-direct {p0}, Lb7/f$b;-><init>()V

    return-void
.end method


# virtual methods
.method public L(I)Lb7/f$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lb7/f;

    invoke-static {v0, p1}, Lb7/f;->U(Lb7/f;I)V

    return-object p0
.end method

.method public M(I)Lb7/f$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lb7/f;

    invoke-static {v0, p1}, Lb7/f;->S(Lb7/f;I)V

    return-object p0
.end method

.method public N(I)Lb7/f$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lb7/f;

    invoke-static {v0, p1}, Lb7/f;->T(Lb7/f;I)V

    return-object p0
.end method
