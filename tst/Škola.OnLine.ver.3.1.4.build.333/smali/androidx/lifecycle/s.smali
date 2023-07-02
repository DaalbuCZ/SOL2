.class public Landroidx/lifecycle/s;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/lifecycle/j;


# static fields
.field private static final v:Landroidx/lifecycle/s;


# instance fields
.field private n:I

.field private o:I

.field private p:Z

.field private q:Z

.field private r:Landroid/os/Handler;

.field private final s:Landroidx/lifecycle/k;

.field private t:Ljava/lang/Runnable;

.field u:Landroidx/lifecycle/t$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/lifecycle/s;

    invoke-direct {v0}, Landroidx/lifecycle/s;-><init>()V

    sput-object v0, Landroidx/lifecycle/s;->v:Landroidx/lifecycle/s;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Landroidx/lifecycle/s;->n:I

    iput v0, p0, Landroidx/lifecycle/s;->o:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/s;->p:Z

    iput-boolean v0, p0, Landroidx/lifecycle/s;->q:Z

    new-instance v0, Landroidx/lifecycle/k;

    invoke-direct {v0, p0}, Landroidx/lifecycle/k;-><init>(Landroidx/lifecycle/j;)V

    iput-object v0, p0, Landroidx/lifecycle/s;->s:Landroidx/lifecycle/k;

    new-instance v0, Landroidx/lifecycle/s$a;

    invoke-direct {v0, p0}, Landroidx/lifecycle/s$a;-><init>(Landroidx/lifecycle/s;)V

    iput-object v0, p0, Landroidx/lifecycle/s;->t:Ljava/lang/Runnable;

    new-instance v0, Landroidx/lifecycle/s$b;

    invoke-direct {v0, p0}, Landroidx/lifecycle/s$b;-><init>(Landroidx/lifecycle/s;)V

    iput-object v0, p0, Landroidx/lifecycle/s;->u:Landroidx/lifecycle/t$a;

    return-void
.end method

.method public static k()Landroidx/lifecycle/j;
    .locals 1

    sget-object v0, Landroidx/lifecycle/s;->v:Landroidx/lifecycle/s;

    return-object v0
.end method

.method static l(Landroid/content/Context;)V
    .locals 1

    sget-object v0, Landroidx/lifecycle/s;->v:Landroidx/lifecycle/s;

    invoke-virtual {v0, p0}, Landroidx/lifecycle/s;->f(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public a()Landroidx/lifecycle/f;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/s;->s:Landroidx/lifecycle/k;

    return-object v0
.end method

.method b()V
    .locals 4

    iget v0, p0, Landroidx/lifecycle/s;->o:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Landroidx/lifecycle/s;->o:I

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/s;->r:Landroid/os/Handler;

    iget-object v1, p0, Landroidx/lifecycle/s;->t:Ljava/lang/Runnable;

    const-wide/16 v2, 0x2bc

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method c()V
    .locals 2

    iget v0, p0, Landroidx/lifecycle/s;->o:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Landroidx/lifecycle/s;->o:I

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Landroidx/lifecycle/s;->p:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/s;->s:Landroidx/lifecycle/k;

    sget-object v1, Landroidx/lifecycle/f$b;->ON_RESUME:Landroidx/lifecycle/f$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k;->h(Landroidx/lifecycle/f$b;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/lifecycle/s;->p:Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/lifecycle/s;->r:Landroid/os/Handler;

    iget-object v1, p0, Landroidx/lifecycle/s;->t:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method d()V
    .locals 2

    iget v0, p0, Landroidx/lifecycle/s;->n:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Landroidx/lifecycle/s;->n:I

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Landroidx/lifecycle/s;->q:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/s;->s:Landroidx/lifecycle/k;

    sget-object v1, Landroidx/lifecycle/f$b;->ON_START:Landroidx/lifecycle/f$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k;->h(Landroidx/lifecycle/f$b;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/lifecycle/s;->q:Z

    :cond_0
    return-void
.end method

.method e()V
    .locals 1

    iget v0, p0, Landroidx/lifecycle/s;->n:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Landroidx/lifecycle/s;->n:I

    invoke-virtual {p0}, Landroidx/lifecycle/s;->h()V

    return-void
.end method

.method f(Landroid/content/Context;)V
    .locals 2

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/s;->r:Landroid/os/Handler;

    iget-object v0, p0, Landroidx/lifecycle/s;->s:Landroidx/lifecycle/k;

    sget-object v1, Landroidx/lifecycle/f$b;->ON_CREATE:Landroidx/lifecycle/f$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k;->h(Landroidx/lifecycle/f$b;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    new-instance v0, Landroidx/lifecycle/s$c;

    invoke-direct {v0, p0}, Landroidx/lifecycle/s$c;-><init>(Landroidx/lifecycle/s;)V

    invoke-virtual {p1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method

.method g()V
    .locals 2

    iget v0, p0, Landroidx/lifecycle/s;->o:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/s;->p:Z

    iget-object v0, p0, Landroidx/lifecycle/s;->s:Landroidx/lifecycle/k;

    sget-object v1, Landroidx/lifecycle/f$b;->ON_PAUSE:Landroidx/lifecycle/f$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k;->h(Landroidx/lifecycle/f$b;)V

    :cond_0
    return-void
.end method

.method h()V
    .locals 2

    iget v0, p0, Landroidx/lifecycle/s;->n:I

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroidx/lifecycle/s;->p:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/s;->s:Landroidx/lifecycle/k;

    sget-object v1, Landroidx/lifecycle/f$b;->ON_STOP:Landroidx/lifecycle/f$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k;->h(Landroidx/lifecycle/f$b;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/s;->q:Z

    :cond_0
    return-void
.end method
