.class public final Ln7/l;
.super Lk7/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln7/l$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lk7/w<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lk7/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk7/r<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final b:Lk7/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk7/j<",
            "TT;>;"
        }
    .end annotation
.end field

.field final c:Lk7/e;

.field private final d:Lr7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr7/a<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final e:Lk7/x;

.field private final f:Ln7/l$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln7/l<",
            "TT;>.b;"
        }
    .end annotation
.end field

.field private g:Lk7/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk7/w<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lk7/r;Lk7/j;Lk7/e;Lr7/a;Lk7/x;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk7/r<",
            "TT;>;",
            "Lk7/j<",
            "TT;>;",
            "Lk7/e;",
            "Lr7/a<",
            "TT;>;",
            "Lk7/x;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lk7/w;-><init>()V

    new-instance v0, Ln7/l$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ln7/l$b;-><init>(Ln7/l;Ln7/l$a;)V

    iput-object v0, p0, Ln7/l;->f:Ln7/l$b;

    iput-object p1, p0, Ln7/l;->a:Lk7/r;

    iput-object p2, p0, Ln7/l;->b:Lk7/j;

    iput-object p3, p0, Ln7/l;->c:Lk7/e;

    iput-object p4, p0, Ln7/l;->d:Lr7/a;

    iput-object p5, p0, Ln7/l;->e:Lk7/x;

    return-void
.end method

.method private f()Lk7/w;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lk7/w<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Ln7/l;->g:Lk7/w;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ln7/l;->c:Lk7/e;

    iget-object v1, p0, Ln7/l;->e:Lk7/x;

    iget-object v2, p0, Ln7/l;->d:Lr7/a;

    invoke-virtual {v0, v1, v2}, Lk7/e;->l(Lk7/x;Lr7/a;)Lk7/w;

    move-result-object v0

    iput-object v0, p0, Ln7/l;->g:Lk7/w;

    :goto_0
    return-object v0
.end method


# virtual methods
.method public c(Ls7/a;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls7/a;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Ln7/l;->b:Lk7/j;

    if-nez v0, :cond_0

    invoke-direct {p0}, Ln7/l;->f()Lk7/w;

    move-result-object v0

    invoke-virtual {v0, p1}, Lk7/w;->c(Ls7/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, Lm7/l;->a(Ls7/a;)Lk7/k;

    move-result-object p1

    invoke-virtual {p1}, Lk7/k;->s()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    iget-object v0, p0, Ln7/l;->b:Lk7/j;

    iget-object v1, p0, Ln7/l;->d:Lr7/a;

    invoke-virtual {v1}, Lr7/a;->e()Ljava/lang/reflect/Type;

    move-result-object v1

    iget-object v2, p0, Ln7/l;->f:Ln7/l$b;

    invoke-interface {v0, p1, v1, v2}, Lk7/j;->a(Lk7/k;Ljava/lang/reflect/Type;Lk7/i;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public e(Ls7/c;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls7/c;",
            "TT;)V"
        }
    .end annotation

    iget-object v0, p0, Ln7/l;->a:Lk7/r;

    if-nez v0, :cond_0

    invoke-direct {p0}, Ln7/l;->f()Lk7/w;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lk7/w;->e(Ls7/c;Ljava/lang/Object;)V

    return-void

    :cond_0
    if-nez p2, :cond_1

    invoke-virtual {p1}, Ls7/c;->F()Ls7/c;

    return-void

    :cond_1
    iget-object v1, p0, Ln7/l;->d:Lr7/a;

    invoke-virtual {v1}, Lr7/a;->e()Ljava/lang/reflect/Type;

    move-result-object v1

    iget-object v2, p0, Ln7/l;->f:Ln7/l$b;

    invoke-interface {v0, p2, v1, v2}, Lk7/r;->a(Ljava/lang/Object;Ljava/lang/reflect/Type;Lk7/q;)Lk7/k;

    move-result-object p2

    invoke-static {p2, p1}, Lm7/l;->b(Lk7/k;Ls7/c;)V

    return-void
.end method
