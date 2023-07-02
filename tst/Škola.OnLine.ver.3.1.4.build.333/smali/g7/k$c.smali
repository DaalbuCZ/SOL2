.class public final Lg7/k$c;
.super Lcom/google/protobuf/y$a;
.source ""

# interfaces
.implements Lcom/google/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg7/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/y$a<",
        "Lg7/k;",
        "Lg7/k$c;",
        ">;",
        "Lcom/google/protobuf/t0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lg7/k;->R()Lg7/k;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/y$a;-><init>(Lcom/google/protobuf/y;)V

    return-void
.end method

.method synthetic constructor <init>(Lg7/k$a;)V
    .locals 0

    invoke-direct {p0}, Lg7/k$c;-><init>()V

    return-void
.end method


# virtual methods
.method public L(Lg7/l;)Lg7/k$c;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/k;

    invoke-static {v0, p1}, Lg7/k;->T(Lg7/k;Lg7/l;)V

    return-object p0
.end method

.method public M(Ljava/lang/String;)Lg7/k$c;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/k;

    invoke-static {v0, p1}, Lg7/k;->S(Lg7/k;Ljava/lang/String;)V

    return-object p0
.end method
