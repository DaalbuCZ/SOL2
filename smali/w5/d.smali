.class public final synthetic Lw5/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lw5/e;

.field public final synthetic o:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method public synthetic constructor <init>(Lw5/e;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw5/d;->n:Lw5/e;

    iput-object p2, p0, Lw5/d;->o:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lw5/d;->n:Lw5/e;

    iget-object v1, p0, Lw5/d;->o:Ljava/util/concurrent/CountDownLatch;

    invoke-static {v0, v1}, Lw5/e;->b(Lw5/e;Ljava/util/concurrent/CountDownLatch;)V

    return-void
.end method
