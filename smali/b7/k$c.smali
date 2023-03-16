.class public final Lb7/k$c;
.super Lcom/google/protobuf/y$a;
.source ""

# interfaces
.implements Lcom/google/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb7/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/y$a<",
        "Lb7/k;",
        "Lb7/k$c;",
        ">;",
        "Lcom/google/protobuf/t0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lb7/k;->R()Lb7/k;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/y$a;-><init>(Lcom/google/protobuf/y;)V

    return-void
.end method

.method synthetic constructor <init>(Lb7/k$a;)V
    .locals 0

    invoke-direct {p0}, Lb7/k$c;-><init>()V

    return-void
.end method


# virtual methods
.method public L(Lb7/l;)Lb7/k$c;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lb7/k;

    invoke-static {v0, p1}, Lb7/k;->T(Lb7/k;Lb7/l;)V

    return-object p0
.end method

.method public M(Ljava/lang/String;)Lb7/k$c;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lb7/k;

    invoke-static {v0, p1}, Lb7/k;->S(Lb7/k;Ljava/lang/String;)V

    return-object p0
.end method
