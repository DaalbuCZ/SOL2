.class public final Li7/l;
.super Lf7/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li7/l$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lf7/w<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lf7/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf7/r<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final b:Lf7/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf7/j<",
            "TT;>;"
        }
    .end annotation
.end field

.field final c:Lf7/e;

.field private final d:Lm7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm7/a<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final e:Lf7/x;

.field private final f:Li7/l$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/l<",
            "TT;>.b;"
        }
    .end annotation
.end field

.field private g:Lf7/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf7/w<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lf7/r;Lf7/j;Lf7/e;Lm7/a;Lf7/x;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf7/r<",
            "TT;>;",
            "Lf7/j<",
            "TT;>;",
            "Lf7/e;",
            "Lm7/a<",
            "TT;>;",
            "Lf7/x;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lf7/w;-><init>()V

    new-instance v0, Li7/l$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Li7/l$b;-><init>(Li7/l;Li7/l$a;)V

    iput-object v0, p0, Li7/l;->f:Li7/l$b;

    iput-object p1, p0, Li7/l;->a:Lf7/r;

    iput-object p2, p0, Li7/l;->b:Lf7/j;

    iput-object p3, p0, Li7/l;->c:Lf7/e;

    iput-object p4, p0, Li7/l;->d:Lm7/a;

    iput-object p5, p0, Li7/l;->e:Lf7/x;

    return-void
.end method

.method private f()Lf7/w;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lf7/w<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Li7/l;->g:Lf7/w;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Li7/l;->c:Lf7/e;

    iget-object v1, p0, Li7/l;->e:Lf7/x;

    iget-object v2, p0, Li7/l;->d:Lm7/a;

    invoke-virtual {v0, v1, v2}, Lf7/e;->l(Lf7/x;Lm7/a;)Lf7/w;

    move-result-object v0

    iput-object v0, p0, Li7/l;->g:Lf7/w;

    :goto_0
    return-object v0
.end method


# virtual methods
.method public c(Ln7/a;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/a;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Li7/l;->b:Lf7/j;

    if-nez v0, :cond_0

    invoke-direct {p0}, Li7/l;->f()Lf7/w;

    move-result-object v0

    invoke-virtual {v0, p1}, Lf7/w;->c(Ln7/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, Lh7/l;->a(Ln7/a;)Lf7/k;

    move-result-object p1

    invoke-virtual {p1}, Lf7/k;->s()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    iget-object v0, p0, Li7/l;->b:Lf7/j;

    iget-object v1, p0, Li7/l;->d:Lm7/a;

    invoke-virtual {v1}, Lm7/a;->e()Ljava/lang/reflect/Type;

    move-result-object v1

    iget-object v2, p0, Li7/l;->f:Li7/l$b;

    invoke-interface {v0, p1, v1, v2}, Lf7/j;->a(Lf7/k;Ljava/lang/reflect/Type;Lf7/i;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public e(Ln7/c;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/c;",
            "TT;)V"
        }
    .end annotation

    iget-object v0, p0, Li7/l;->a:Lf7/r;

    if-nez v0, :cond_0

    invoke-direct {p0}, Li7/l;->f()Lf7/w;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lf7/w;->e(Ln7/c;Ljava/lang/Object;)V

    return-void

    :cond_0
    if-nez p2, :cond_1

    invoke-virtual {p1}, Ln7/c;->D()Ln7/c;

    return-void

    :cond_1
    iget-object v1, p0, Li7/l;->d:Lm7/a;

    invoke-virtual {v1}, Lm7/a;->e()Ljava/lang/reflect/Type;

    move-result-object v1

    iget-object v2, p0, Li7/l;->f:Li7/l$b;

    invoke-interface {v0, p2, v1, v2}, Lf7/r;->a(Ljava/lang/Object;Ljava/lang/reflect/Type;Lf7/q;)Lf7/k;

    move-result-object p2

    invoke-static {p2, p1}, Lh7/l;->b(Lf7/k;Ln7/c;)V

    return-void
.end method
