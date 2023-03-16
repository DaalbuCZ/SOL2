.class public abstract Lcom/google/protobuf/y$c;
.super Lcom/google/protobuf/y;
.source ""

# interfaces
.implements Lcom/google/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/protobuf/y$c<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/protobuf/y<",
        "TMessageType;TBuilderType;>;",
        "Lcom/google/protobuf/t0;"
    }
.end annotation


# instance fields
.field protected extensions:Lcom/google/protobuf/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/u<",
            "Lcom/google/protobuf/y$d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/y;-><init>()V

    invoke-static {}, Lcom/google/protobuf/u;->h()Lcom/google/protobuf/u;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/y$c;->extensions:Lcom/google/protobuf/u;

    return-void
.end method


# virtual methods
.method R()Lcom/google/protobuf/u;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/u<",
            "Lcom/google/protobuf/y$d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/protobuf/y$c;->extensions:Lcom/google/protobuf/u;

    invoke-virtual {v0}, Lcom/google/protobuf/u;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/protobuf/y$c;->extensions:Lcom/google/protobuf/u;

    invoke-virtual {v0}, Lcom/google/protobuf/u;->b()Lcom/google/protobuf/u;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/y$c;->extensions:Lcom/google/protobuf/u;

    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/y$c;->extensions:Lcom/google/protobuf/u;

    return-object v0
.end method

.method public bridge synthetic e()Lcom/google/protobuf/s0;
    .locals 1

    invoke-super {p0}, Lcom/google/protobuf/y;->G()Lcom/google/protobuf/y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g()Lcom/google/protobuf/s0$a;
    .locals 1

    invoke-super {p0}, Lcom/google/protobuf/y;->Q()Lcom/google/protobuf/y$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic m()Lcom/google/protobuf/s0$a;
    .locals 1

    invoke-super {p0}, Lcom/google/protobuf/y;->M()Lcom/google/protobuf/y$a;

    move-result-object v0

    return-object v0
.end method
