.class final Lg1/e;
.super Lg1/v;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg1/e$b;
    }
.end annotation


# instance fields
.field private n:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field private o:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private p:Lx8/a;

.field private q:Lx8/a;

.field private r:Lx8/a;

.field private s:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private t:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Lo1/m0;",
            ">;"
        }
    .end annotation
.end field

.field private u:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Ln1/g;",
            ">;"
        }
    .end annotation
.end field

.field private v:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Ln1/y;",
            ">;"
        }
    .end annotation
.end field

.field private w:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Lm1/c;",
            ">;"
        }
    .end annotation
.end field

.field private x:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Ln1/s;",
            ">;"
        }
    .end annotation
.end field

.field private y:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Ln1/w;",
            ">;"
        }
    .end annotation
.end field

.field private z:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Lg1/u;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Lg1/v;-><init>()V

    invoke-direct {p0, p1}, Lg1/e;->f(Landroid/content/Context;)V

    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;Lg1/e$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lg1/e;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public static c()Lg1/v$a;
    .locals 2

    new-instance v0, Lg1/e$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lg1/e$b;-><init>(Lg1/e$a;)V

    return-object v0
.end method

.method private f(Landroid/content/Context;)V
    .locals 9

    invoke-static {}, Lg1/k;->a()Lg1/k;

    move-result-object v0

    invoke-static {v0}, Li1/a;->a(Lx8/a;)Lx8/a;

    move-result-object v0

    iput-object v0, p0, Lg1/e;->n:Lx8/a;

    invoke-static {p1}, Li1/c;->a(Ljava/lang/Object;)Li1/b;

    move-result-object p1

    iput-object p1, p0, Lg1/e;->o:Lx8/a;

    invoke-static {}, Lq1/c;->a()Lq1/c;

    move-result-object v0

    invoke-static {}, Lq1/d;->a()Lq1/d;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lh1/j;->a(Lx8/a;Lx8/a;Lx8/a;)Lh1/j;

    move-result-object p1

    iput-object p1, p0, Lg1/e;->p:Lx8/a;

    iget-object v0, p0, Lg1/e;->o:Lx8/a;

    invoke-static {v0, p1}, Lh1/l;->a(Lx8/a;Lx8/a;)Lh1/l;

    move-result-object p1

    invoke-static {p1}, Li1/a;->a(Lx8/a;)Lx8/a;

    move-result-object p1

    iput-object p1, p0, Lg1/e;->q:Lx8/a;

    iget-object p1, p0, Lg1/e;->o:Lx8/a;

    invoke-static {}, Lo1/g;->a()Lo1/g;

    move-result-object v0

    invoke-static {}, Lo1/i;->a()Lo1/i;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lo1/u0;->a(Lx8/a;Lx8/a;Lx8/a;)Lo1/u0;

    move-result-object p1

    iput-object p1, p0, Lg1/e;->r:Lx8/a;

    iget-object p1, p0, Lg1/e;->o:Lx8/a;

    invoke-static {p1}, Lo1/h;->a(Lx8/a;)Lo1/h;

    move-result-object p1

    invoke-static {p1}, Li1/a;->a(Lx8/a;)Lx8/a;

    move-result-object p1

    iput-object p1, p0, Lg1/e;->s:Lx8/a;

    invoke-static {}, Lq1/c;->a()Lq1/c;

    move-result-object p1

    invoke-static {}, Lq1/d;->a()Lq1/d;

    move-result-object v0

    invoke-static {}, Lo1/j;->a()Lo1/j;

    move-result-object v1

    iget-object v2, p0, Lg1/e;->r:Lx8/a;

    iget-object v3, p0, Lg1/e;->s:Lx8/a;

    invoke-static {p1, v0, v1, v2, v3}, Lo1/n0;->a(Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;)Lo1/n0;

    move-result-object p1

    invoke-static {p1}, Li1/a;->a(Lx8/a;)Lx8/a;

    move-result-object p1

    iput-object p1, p0, Lg1/e;->t:Lx8/a;

    invoke-static {}, Lq1/c;->a()Lq1/c;

    move-result-object p1

    invoke-static {p1}, Lm1/g;->b(Lx8/a;)Lm1/g;

    move-result-object p1

    iput-object p1, p0, Lg1/e;->u:Lx8/a;

    iget-object v0, p0, Lg1/e;->o:Lx8/a;

    iget-object v1, p0, Lg1/e;->t:Lx8/a;

    invoke-static {}, Lq1/d;->a()Lq1/d;

    move-result-object v2

    invoke-static {v0, v1, p1, v2}, Lm1/i;->a(Lx8/a;Lx8/a;Lx8/a;Lx8/a;)Lm1/i;

    move-result-object p1

    iput-object p1, p0, Lg1/e;->v:Lx8/a;

    iget-object v0, p0, Lg1/e;->n:Lx8/a;

    iget-object v1, p0, Lg1/e;->q:Lx8/a;

    iget-object v2, p0, Lg1/e;->t:Lx8/a;

    invoke-static {v0, v1, p1, v2, v2}, Lm1/d;->a(Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;)Lm1/d;

    move-result-object p1

    iput-object p1, p0, Lg1/e;->w:Lx8/a;

    iget-object v0, p0, Lg1/e;->o:Lx8/a;

    iget-object v1, p0, Lg1/e;->q:Lx8/a;

    iget-object v5, p0, Lg1/e;->t:Lx8/a;

    iget-object v3, p0, Lg1/e;->v:Lx8/a;

    iget-object v4, p0, Lg1/e;->n:Lx8/a;

    invoke-static {}, Lq1/c;->a()Lq1/c;

    move-result-object v6

    invoke-static {}, Lq1/d;->a()Lq1/d;

    move-result-object v7

    iget-object v8, p0, Lg1/e;->t:Lx8/a;

    move-object v2, v5

    invoke-static/range {v0 .. v8}, Ln1/t;->a(Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;)Ln1/t;

    move-result-object p1

    iput-object p1, p0, Lg1/e;->x:Lx8/a;

    iget-object p1, p0, Lg1/e;->n:Lx8/a;

    iget-object v0, p0, Lg1/e;->t:Lx8/a;

    iget-object v1, p0, Lg1/e;->v:Lx8/a;

    invoke-static {p1, v0, v1, v0}, Ln1/x;->a(Lx8/a;Lx8/a;Lx8/a;Lx8/a;)Ln1/x;

    move-result-object p1

    iput-object p1, p0, Lg1/e;->y:Lx8/a;

    invoke-static {}, Lq1/c;->a()Lq1/c;

    move-result-object p1

    invoke-static {}, Lq1/d;->a()Lq1/d;

    move-result-object v0

    iget-object v1, p0, Lg1/e;->w:Lx8/a;

    iget-object v2, p0, Lg1/e;->x:Lx8/a;

    iget-object v3, p0, Lg1/e;->y:Lx8/a;

    invoke-static {p1, v0, v1, v2, v3}, Lg1/w;->a(Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;)Lg1/w;

    move-result-object p1

    invoke-static {p1}, Li1/a;->a(Lx8/a;)Lx8/a;

    move-result-object p1

    iput-object p1, p0, Lg1/e;->z:Lx8/a;

    return-void
.end method


# virtual methods
.method a()Lo1/d;
    .locals 1

    iget-object v0, p0, Lg1/e;->t:Lx8/a;

    invoke-interface {v0}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo1/d;

    return-object v0
.end method

.method b()Lg1/u;
    .locals 1

    iget-object v0, p0, Lg1/e;->z:Lx8/a;

    invoke-interface {v0}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/u;

    return-object v0
.end method
