.class Ld1/y$b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld1/y$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Ld1/y$b;


# direct methods
.method constructor <init>(Ld1/y$b;)V
    .locals 0

    iput-object p1, p0, Ld1/y$b$a;->n:Ld1/y$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->maxMemory()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Runtime;->totalMemory()J

    move-result-wide v2

    iget-object v4, p0, Ld1/y$b$a;->n:Ld1/y$b;

    long-to-float v2, v2

    long-to-float v0, v0

    div-float/2addr v2, v0

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr v0, v2

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float/2addr v0, v1

    invoke-static {v4, v0}, Ld1/y$b;->b(Ld1/y$b;F)F

    iget-object v0, p0, Ld1/y$b$a;->n:Ld1/y$b;

    invoke-static {v0}, Ld1/y$b;->d(Ld1/y$b;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Ld1/y$b$a;->n:Ld1/y$b;

    invoke-static {v1}, Ld1/y$b;->c(Ld1/y$b;)Ljava/lang/Runnable;

    move-result-object v1

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x1

    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
