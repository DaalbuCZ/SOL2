.class final Lt8/d$c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt8/d$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt8/d$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field final a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field final synthetic b:Lt8/d$c;


# direct methods
.method private constructor <init>(Lt8/d$c;)V
    .locals 1

    iput-object p1, p0, Lt8/d$c$a;->b:Lt8/d$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lt8/d$c$a;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method synthetic constructor <init>(Lt8/d$c;Lt8/d$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lt8/d$c$a;-><init>(Lt8/d$c;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lt8/d$c$a;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lt8/d$c$a;->b:Lt8/d$c;

    invoke-static {v0}, Lt8/d$c;->b(Lt8/d$c;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lt8/d$c$a;->b:Lt8/d$c;

    iget-object v0, v0, Lt8/d$c;->c:Lt8/d;

    invoke-static {v0}, Lt8/d;->c(Lt8/d;)Lt8/c;

    move-result-object v0

    iget-object v1, p0, Lt8/d$c$a;->b:Lt8/d$c;

    iget-object v1, v1, Lt8/d$c;->c:Lt8/d;

    invoke-static {v1}, Lt8/d;->b(Lt8/d;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lt8/d$c$a;->b:Lt8/d$c;

    iget-object v2, v2, Lt8/d$c;->c:Lt8/d;

    invoke-static {v2}, Lt8/d;->a(Lt8/d;)Lt8/l;

    move-result-object v2

    invoke-interface {v2, p1}, Lt8/l;->a(Ljava/lang/Object;)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lt8/c;->f(Ljava/lang/String;Ljava/nio/ByteBuffer;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lt8/d$c$a;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lt8/d$c$a;->b:Lt8/d$c;

    invoke-static {v0}, Lt8/d$c;->b(Lt8/d$c;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lt8/d$c$a;->b:Lt8/d$c;

    iget-object v0, v0, Lt8/d$c;->c:Lt8/d;

    invoke-static {v0}, Lt8/d;->c(Lt8/d;)Lt8/c;

    move-result-object v0

    iget-object v1, p0, Lt8/d$c$a;->b:Lt8/d$c;

    iget-object v1, v1, Lt8/d$c;->c:Lt8/d;

    invoke-static {v1}, Lt8/d;->b(Lt8/d;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lt8/d$c$a;->b:Lt8/d$c;

    iget-object v2, v2, Lt8/d$c;->c:Lt8/d;

    invoke-static {v2}, Lt8/d;->a(Lt8/d;)Lt8/l;

    move-result-object v2

    invoke-interface {v2, p1, p2, p3}, Lt8/l;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lt8/c;->f(Ljava/lang/String;Ljava/nio/ByteBuffer;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public c()V
    .locals 3

    iget-object v0, p0, Lt8/d$c$a;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lt8/d$c$a;->b:Lt8/d$c;

    invoke-static {v0}, Lt8/d$c;->b(Lt8/d$c;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lt8/d$c$a;->b:Lt8/d$c;

    iget-object v0, v0, Lt8/d$c;->c:Lt8/d;

    invoke-static {v0}, Lt8/d;->c(Lt8/d;)Lt8/c;

    move-result-object v0

    iget-object v1, p0, Lt8/d$c$a;->b:Lt8/d$c;

    iget-object v1, v1, Lt8/d$c;->c:Lt8/d;

    invoke-static {v1}, Lt8/d;->b(Lt8/d;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lt8/c;->f(Ljava/lang/String;Ljava/nio/ByteBuffer;)V

    :cond_1
    :goto_0
    return-void
.end method
