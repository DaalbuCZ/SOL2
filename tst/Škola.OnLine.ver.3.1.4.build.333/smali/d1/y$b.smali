.class Ld1/y$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld1/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private a:F

.field private final b:Landroid/os/Handler;

.field private final c:Ljava/lang/Runnable;

.field private d:Z


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x42c80000    # 100.0f

    iput v0, p0, Ld1/y$b;->a:F

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Ld1/y$b;->b:Landroid/os/Handler;

    new-instance v0, Ld1/y$b$a;

    invoke-direct {v0, p0}, Ld1/y$b$a;-><init>(Ld1/y$b;)V

    iput-object v0, p0, Ld1/y$b;->c:Ljava/lang/Runnable;

    const/4 v0, 0x0

    iput-boolean v0, p0, Ld1/y$b;->d:Z

    return-void
.end method

.method synthetic constructor <init>(Ld1/y$a;)V
    .locals 0

    invoke-direct {p0}, Ld1/y$b;-><init>()V

    return-void
.end method

.method static synthetic b(Ld1/y$b;F)F
    .locals 0

    iput p1, p0, Ld1/y$b;->a:F

    return p1
.end method

.method static synthetic c(Ld1/y$b;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Ld1/y$b;->c:Ljava/lang/Runnable;

    return-object p0
.end method

.method static synthetic d(Ld1/y$b;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Ld1/y$b;->b:Landroid/os/Handler;

    return-object p0
.end method


# virtual methods
.method a()F
    .locals 1

    iget v0, p0, Ld1/y$b;->a:F

    return v0
.end method

.method e()V
    .locals 1

    iget-boolean v0, p0, Ld1/y$b;->d:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Ld1/y$b;->d:Z

    iget-object v0, p0, Ld1/y$b;->c:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_0
    return-void
.end method

.method f()V
    .locals 2

    iget-boolean v0, p0, Ld1/y$b;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ld1/y$b;->b:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ld1/y$b;->d:Z

    :cond_0
    return-void
.end method
