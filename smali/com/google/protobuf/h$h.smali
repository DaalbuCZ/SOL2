.class final Lcom/google/protobuf/h$h;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "h"
.end annotation


# instance fields
.field private final a:Lcom/google/protobuf/k;

.field private final b:[B


# direct methods
.method private constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-array p1, p1, [B

    iput-object p1, p0, Lcom/google/protobuf/h$h;->b:[B

    invoke-static {p1}, Lcom/google/protobuf/k;->d0([B)Lcom/google/protobuf/k;

    move-result-object p1

    iput-object p1, p0, Lcom/google/protobuf/h$h;->a:Lcom/google/protobuf/k;

    return-void
.end method

.method synthetic constructor <init>(ILcom/google/protobuf/h$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/protobuf/h$h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/protobuf/h;
    .locals 2

    iget-object v0, p0, Lcom/google/protobuf/h$h;->a:Lcom/google/protobuf/k;

    invoke-virtual {v0}, Lcom/google/protobuf/k;->c()V

    new-instance v0, Lcom/google/protobuf/h$j;

    iget-object v1, p0, Lcom/google/protobuf/h$h;->b:[B

    invoke-direct {v0, v1}, Lcom/google/protobuf/h$j;-><init>([B)V

    return-object v0
.end method

.method public b()Lcom/google/protobuf/k;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/h$h;->a:Lcom/google/protobuf/k;

    return-object v0
.end method
