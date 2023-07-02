.class Lt8/k$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt8/k$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt8/k$a;->a(Ljava/nio/ByteBuffer;Lt8/c$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lt8/c$b;

.field final synthetic b:Lt8/k$a;


# direct methods
.method constructor <init>(Lt8/k$a;Lt8/c$b;)V
    .locals 0

    iput-object p1, p0, Lt8/k$a$a;->b:Lt8/k$a;

    iput-object p2, p0, Lt8/k$a$a;->a:Lt8/c$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lt8/k$a$a;->a:Lt8/c$b;

    iget-object v1, p0, Lt8/k$a$a;->b:Lt8/k$a;

    iget-object v1, v1, Lt8/k$a;->b:Lt8/k;

    invoke-static {v1}, Lt8/k;->a(Lt8/k;)Lt8/l;

    move-result-object v1

    invoke-interface {v1, p1}, Lt8/l;->a(Ljava/lang/Object;)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-interface {v0, p1}, Lt8/c$b;->a(Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lt8/k$a$a;->a:Lt8/c$b;

    iget-object v1, p0, Lt8/k$a$a;->b:Lt8/k$a;

    iget-object v1, v1, Lt8/k$a;->b:Lt8/k;

    invoke-static {v1}, Lt8/k;->a(Lt8/k;)Lt8/l;

    move-result-object v1

    invoke-interface {v1, p1, p2, p3}, Lt8/l;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-interface {v0, p1}, Lt8/c$b;->a(Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Lt8/k$a$a;->a:Lt8/c$b;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lt8/c$b;->a(Ljava/nio/ByteBuffer;)V

    return-void
.end method
