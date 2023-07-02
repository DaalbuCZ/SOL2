.class public final Lg7/a$b;
.super Lcom/google/protobuf/y$a;
.source ""

# interfaces
.implements Lcom/google/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/y$a<",
        "Lg7/a;",
        "Lg7/a$b;",
        ">;",
        "Lcom/google/protobuf/t0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lg7/a;->R()Lg7/a;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/y$a;-><init>(Lcom/google/protobuf/y;)V

    return-void
.end method

.method synthetic constructor <init>(Lg7/a$a;)V
    .locals 0

    invoke-direct {p0}, Lg7/a$b;-><init>()V

    return-void
.end method


# virtual methods
.method public L(Ljava/lang/String;)Lg7/a$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/a;

    invoke-static {v0, p1}, Lg7/a;->S(Lg7/a;Ljava/lang/String;)V

    return-object p0
.end method

.method public M(Ljava/lang/String;)Lg7/a$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/a;

    invoke-static {v0, p1}, Lg7/a;->T(Lg7/a;Ljava/lang/String;)V

    return-object p0
.end method

.method public N(Ljava/lang/String;)Lg7/a$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/a;

    invoke-static {v0, p1}, Lg7/a;->U(Lg7/a;Ljava/lang/String;)V

    return-object p0
.end method
