.class public Landroidx/lifecycle/z;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/z$a;
    }
.end annotation


# instance fields
.field private final a:Landroidx/lifecycle/k;

.field private final b:Landroid/os/Handler;

.field private c:Landroidx/lifecycle/z$a;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/j;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/lifecycle/k;

    invoke-direct {v0, p1}, Landroidx/lifecycle/k;-><init>(Landroidx/lifecycle/j;)V

    iput-object v0, p0, Landroidx/lifecycle/z;->a:Landroidx/lifecycle/k;

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/z;->b:Landroid/os/Handler;

    return-void
.end method

.method private f(Landroidx/lifecycle/f$b;)V
    .locals 2

    iget-object v0, p0, Landroidx/lifecycle/z;->c:Landroidx/lifecycle/z$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/lifecycle/z$a;->run()V

    :cond_0
    new-instance v0, Landroidx/lifecycle/z$a;

    iget-object v1, p0, Landroidx/lifecycle/z;->a:Landroidx/lifecycle/k;

    invoke-direct {v0, v1, p1}, Landroidx/lifecycle/z$a;-><init>(Landroidx/lifecycle/k;Landroidx/lifecycle/f$b;)V

    iput-object v0, p0, Landroidx/lifecycle/z;->c:Landroidx/lifecycle/z$a;

    iget-object p1, p0, Landroidx/lifecycle/z;->b:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public a()Landroidx/lifecycle/f;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/z;->a:Landroidx/lifecycle/k;

    return-object v0
.end method

.method public b()V
    .locals 1

    sget-object v0, Landroidx/lifecycle/f$b;->ON_START:Landroidx/lifecycle/f$b;

    invoke-direct {p0, v0}, Landroidx/lifecycle/z;->f(Landroidx/lifecycle/f$b;)V

    return-void
.end method

.method public c()V
    .locals 1

    sget-object v0, Landroidx/lifecycle/f$b;->ON_CREATE:Landroidx/lifecycle/f$b;

    invoke-direct {p0, v0}, Landroidx/lifecycle/z;->f(Landroidx/lifecycle/f$b;)V

    return-void
.end method

.method public d()V
    .locals 1

    sget-object v0, Landroidx/lifecycle/f$b;->ON_STOP:Landroidx/lifecycle/f$b;

    invoke-direct {p0, v0}, Landroidx/lifecycle/z;->f(Landroidx/lifecycle/f$b;)V

    sget-object v0, Landroidx/lifecycle/f$b;->ON_DESTROY:Landroidx/lifecycle/f$b;

    invoke-direct {p0, v0}, Landroidx/lifecycle/z;->f(Landroidx/lifecycle/f$b;)V

    return-void
.end method

.method public e()V
    .locals 1

    sget-object v0, Landroidx/lifecycle/f$b;->ON_START:Landroidx/lifecycle/f$b;

    invoke-direct {p0, v0}, Landroidx/lifecycle/z;->f(Landroidx/lifecycle/f$b;)V

    return-void
.end method
