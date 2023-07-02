.class public Lq0/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp0/m;


# instance fields
.field private final c:Landroidx/lifecycle/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p<",
            "Lp0/m$b;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Landroidx/work/impl/utils/futures/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/work/impl/utils/futures/c<",
            "Lp0/m$b$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/lifecycle/p;

    invoke-direct {v0}, Landroidx/lifecycle/p;-><init>()V

    iput-object v0, p0, Lq0/c;->c:Landroidx/lifecycle/p;

    invoke-static {}, Landroidx/work/impl/utils/futures/c;->t()Landroidx/work/impl/utils/futures/c;

    move-result-object v0

    iput-object v0, p0, Lq0/c;->d:Landroidx/work/impl/utils/futures/c;

    sget-object v0, Lp0/m;->b:Lp0/m$b$b;

    invoke-virtual {p0, v0}, Lq0/c;->a(Lp0/m$b;)V

    return-void
.end method


# virtual methods
.method public a(Lp0/m$b;)V
    .locals 1

    iget-object v0, p0, Lq0/c;->c:Landroidx/lifecycle/p;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/p;->g(Ljava/lang/Object;)V

    instance-of v0, p1, Lp0/m$b$c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lq0/c;->d:Landroidx/work/impl/utils/futures/c;

    check-cast p1, Lp0/m$b$c;

    invoke-virtual {v0, p1}, Landroidx/work/impl/utils/futures/c;->p(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lp0/m$b$a;

    if-eqz v0, :cond_1

    check-cast p1, Lp0/m$b$a;

    iget-object v0, p0, Lq0/c;->d:Landroidx/work/impl/utils/futures/c;

    invoke-virtual {p1}, Lp0/m$b$a;->a()Ljava/lang/Throwable;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/work/impl/utils/futures/c;->q(Ljava/lang/Throwable;)Z

    :cond_1
    :goto_0
    return-void
.end method
