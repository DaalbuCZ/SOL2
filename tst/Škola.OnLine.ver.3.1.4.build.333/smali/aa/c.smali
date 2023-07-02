.class public final Laa/c;
.super Laa/d;
.source ""


# instance fields
.field private volatile _immediate:Laa/c;

.field private final p:Landroid/os/Handler;

.field private final q:Ljava/lang/String;

.field private final r:Z

.field private final s:Laa/c;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Laa/c;-><init>(Landroid/os/Handler;Ljava/lang/String;Z)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Handler;Ljava/lang/String;ILs9/g;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Laa/c;-><init>(Landroid/os/Handler;Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Landroid/os/Handler;Ljava/lang/String;Z)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Laa/d;-><init>(Ls9/g;)V

    iput-object p1, p0, Laa/c;->p:Landroid/os/Handler;

    iput-object p2, p0, Laa/c;->q:Ljava/lang/String;

    iput-boolean p3, p0, Laa/c;->r:Z

    if-eqz p3, :cond_0

    move-object v0, p0

    :cond_0
    iput-object v0, p0, Laa/c;->_immediate:Laa/c;

    iget-object p3, p0, Laa/c;->_immediate:Laa/c;

    if-nez p3, :cond_1

    new-instance p3, Laa/c;

    const/4 v0, 0x1

    invoke-direct {p3, p1, p2, v0}, Laa/c;-><init>(Landroid/os/Handler;Ljava/lang/String;Z)V

    iput-object p3, p0, Laa/c;->_immediate:Laa/c;

    :cond_1
    iput-object p3, p0, Laa/c;->s:Laa/c;

    return-void
.end method

.method private final a0(Lj9/g;Ljava/lang/Runnable;)V
    .locals 3

    new-instance v0, Ljava/util/concurrent/CancellationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The task was rejected, the handler underlying the dispatcher \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\' was closed"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v0}, Lz9/t1;->c(Lj9/g;Ljava/util/concurrent/CancellationException;)V

    invoke-static {}, Lz9/x0;->b()Lz9/d0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lz9/d0;->b(Lj9/g;Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public W(Lj9/g;)Z
    .locals 1

    iget-boolean p1, p0, Laa/c;->r:Z

    if-eqz p1, :cond_1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    iget-object v0, p0, Laa/c;->p:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {p1, v0}, Ls9/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public bridge synthetic Y()Lz9/z1;
    .locals 1

    invoke-virtual {p0}, Laa/c;->b0()Laa/c;

    move-result-object v0

    return-object v0
.end method

.method public b(Lj9/g;Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Laa/c;->p:Landroid/os/Handler;

    invoke-virtual {v0, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, p1, p2}, Laa/c;->a0(Lj9/g;Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public b0()Laa/c;
    .locals 1

    iget-object v0, p0, Laa/c;->s:Laa/c;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Laa/c;

    if-eqz v0, :cond_0

    check-cast p1, Laa/c;

    iget-object p1, p1, Laa/c;->p:Landroid/os/Handler;

    iget-object v0, p0, Laa/c;->p:Landroid/os/Handler;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Laa/c;->p:Landroid/os/Handler;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lz9/z1;->Z()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Laa/c;->q:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Laa/c;->p:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    iget-boolean v1, p0, Laa/c;->r:Z

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ".immediate"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method
