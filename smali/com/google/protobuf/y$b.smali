.class public Lcom/google/protobuf/y$b;
.super Lcom/google/protobuf/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/google/protobuf/y<",
        "TT;*>;>",
        "Lcom/google/protobuf/b<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final b:Lcom/google/protobuf/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/protobuf/y;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/protobuf/b;-><init>()V

    iput-object p1, p0, Lcom/google/protobuf/y$b;->b:Lcom/google/protobuf/y;

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Lcom/google/protobuf/i;Lcom/google/protobuf/p;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/y$b;->g(Lcom/google/protobuf/i;Lcom/google/protobuf/p;)Lcom/google/protobuf/y;

    move-result-object p1

    return-object p1
.end method

.method public g(Lcom/google/protobuf/i;Lcom/google/protobuf/p;)Lcom/google/protobuf/y;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/protobuf/i;",
            "Lcom/google/protobuf/p;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/protobuf/y$b;->b:Lcom/google/protobuf/y;

    invoke-static {v0, p1, p2}, Lcom/google/protobuf/y;->O(Lcom/google/protobuf/y;Lcom/google/protobuf/i;Lcom/google/protobuf/p;)Lcom/google/protobuf/y;

    move-result-object p1

    return-object p1
.end method
