.class Ld1/q1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld1/y$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld1/q1;-><init>(Ljava/lang/String;Ld1/s2;Ld1/t;Ld1/f2;Ld1/j3;Ld1/e0;Ld1/s;Ld1/z0;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ld1/q1;


# direct methods
.method constructor <init>(Ld1/q1;)V
    .locals 0

    iput-object p1, p0, Ld1/q1$a;->a:Ld1/q1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/concurrent/ThreadPoolExecutor;Z)V
    .locals 3

    iget-object p2, p0, Ld1/q1$a;->a:Ld1/q1;

    sget-object v0, Ld1/n0$c;->o:Ld1/n0$c;

    const-string v1, "bf_log_memory_pressure"

    const-string v2, "Bugfender received a memory warning. New incoming logs will be discarded until the logs pending to be processed are reduced."

    invoke-static {p2, v0, v1, v2}, Ld1/q1;->a(Ld1/q1;Ld1/n0$c;Ljava/lang/String;Ljava/lang/String;)Ld1/n0;

    move-result-object v0

    invoke-static {p2, v0}, Ld1/q1;->g(Ld1/q1;Ld1/n0;)Ljava/util/concurrent/Callable;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    return-void
.end method
