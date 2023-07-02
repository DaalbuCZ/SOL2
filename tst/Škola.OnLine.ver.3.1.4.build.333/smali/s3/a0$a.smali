.class public Ls3/a0$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:Z

.field private l:Lg5/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg5/q<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private m:I

.field private n:Lg5/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg5/q<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private o:I

.field private p:I

.field private q:I

.field private r:Lg5/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg5/q<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private s:Lg5/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg5/q<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private t:I

.field private u:I

.field private v:Z

.field private w:Z

.field private x:Z

.field private y:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lz2/t0;",
            "Ls3/y;",
            ">;"
        }
    .end annotation
.end field

.field private z:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7fffffff

    iput v0, p0, Ls3/a0$a;->a:I

    iput v0, p0, Ls3/a0$a;->b:I

    iput v0, p0, Ls3/a0$a;->c:I

    iput v0, p0, Ls3/a0$a;->d:I

    iput v0, p0, Ls3/a0$a;->i:I

    iput v0, p0, Ls3/a0$a;->j:I

    const/4 v1, 0x1

    iput-boolean v1, p0, Ls3/a0$a;->k:Z

    invoke-static {}, Lg5/q;->J()Lg5/q;

    move-result-object v1

    iput-object v1, p0, Ls3/a0$a;->l:Lg5/q;

    const/4 v1, 0x0

    iput v1, p0, Ls3/a0$a;->m:I

    invoke-static {}, Lg5/q;->J()Lg5/q;

    move-result-object v2

    iput-object v2, p0, Ls3/a0$a;->n:Lg5/q;

    iput v1, p0, Ls3/a0$a;->o:I

    iput v0, p0, Ls3/a0$a;->p:I

    iput v0, p0, Ls3/a0$a;->q:I

    invoke-static {}, Lg5/q;->J()Lg5/q;

    move-result-object v0

    iput-object v0, p0, Ls3/a0$a;->r:Lg5/q;

    invoke-static {}, Lg5/q;->J()Lg5/q;

    move-result-object v0

    iput-object v0, p0, Ls3/a0$a;->s:Lg5/q;

    iput v1, p0, Ls3/a0$a;->t:I

    iput v1, p0, Ls3/a0$a;->u:I

    iput-boolean v1, p0, Ls3/a0$a;->v:Z

    iput-boolean v1, p0, Ls3/a0$a;->w:Z

    iput-boolean v1, p0, Ls3/a0$a;->x:Z

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ls3/a0$a;->y:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ls3/a0$a;->z:Ljava/util/HashSet;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ls3/a0$a;-><init>()V

    invoke-virtual {p0, p1}, Ls3/a0$a;->E(Landroid/content/Context;)Ls3/a0$a;

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Ls3/a0$a;->H(Landroid/content/Context;Z)Ls3/a0$a;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Bundle;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ls3/a0;->a()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ls3/a0;->N:Ls3/a0;

    iget v2, v1, Ls3/a0;->n:I

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ls3/a0$a;->a:I

    invoke-static {}, Ls3/a0;->b()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Ls3/a0;->o:I

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ls3/a0$a;->b:I

    invoke-static {}, Ls3/a0;->m()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Ls3/a0;->p:I

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ls3/a0$a;->c:I

    invoke-static {}, Ls3/a0;->t()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Ls3/a0;->q:I

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ls3/a0$a;->d:I

    invoke-static {}, Ls3/a0;->u()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Ls3/a0;->r:I

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ls3/a0$a;->e:I

    invoke-static {}, Ls3/a0;->v()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Ls3/a0;->s:I

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ls3/a0$a;->f:I

    invoke-static {}, Ls3/a0;->w()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Ls3/a0;->t:I

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ls3/a0$a;->g:I

    invoke-static {}, Ls3/a0;->x()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Ls3/a0;->u:I

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ls3/a0$a;->h:I

    invoke-static {}, Ls3/a0;->y()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Ls3/a0;->v:I

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ls3/a0$a;->i:I

    invoke-static {}, Ls3/a0;->z()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Ls3/a0;->w:I

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ls3/a0$a;->j:I

    invoke-static {}, Ls3/a0;->c()Ljava/lang/String;

    move-result-object v0

    iget-boolean v2, v1, Ls3/a0;->x:Z

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Ls3/a0$a;->k:Z

    invoke-static {}, Ls3/a0;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/String;

    invoke-static {v0, v3}, Lf5/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-static {v0}, Lg5/q;->G([Ljava/lang/Object;)Lg5/q;

    move-result-object v0

    iput-object v0, p0, Ls3/a0$a;->l:Lg5/q;

    invoke-static {}, Ls3/a0;->e()Ljava/lang/String;

    move-result-object v0

    iget v3, v1, Ls3/a0;->z:I

    invoke-virtual {p1, v0, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ls3/a0$a;->m:I

    invoke-static {}, Ls3/a0;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    new-array v3, v2, [Ljava/lang/String;

    invoke-static {v0, v3}, Lf5/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-static {v0}, Ls3/a0$a;->C([Ljava/lang/String;)Lg5/q;

    move-result-object v0

    iput-object v0, p0, Ls3/a0$a;->n:Lg5/q;

    invoke-static {}, Ls3/a0;->g()Ljava/lang/String;

    move-result-object v0

    iget v3, v1, Ls3/a0;->B:I

    invoke-virtual {p1, v0, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ls3/a0$a;->o:I

    invoke-static {}, Ls3/a0;->h()Ljava/lang/String;

    move-result-object v0

    iget v3, v1, Ls3/a0;->C:I

    invoke-virtual {p1, v0, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ls3/a0$a;->p:I

    invoke-static {}, Ls3/a0;->i()Ljava/lang/String;

    move-result-object v0

    iget v3, v1, Ls3/a0;->D:I

    invoke-virtual {p1, v0, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ls3/a0$a;->q:I

    invoke-static {}, Ls3/a0;->j()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    new-array v3, v2, [Ljava/lang/String;

    invoke-static {v0, v3}, Lf5/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-static {v0}, Lg5/q;->G([Ljava/lang/Object;)Lg5/q;

    move-result-object v0

    iput-object v0, p0, Ls3/a0$a;->r:Lg5/q;

    invoke-static {}, Ls3/a0;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    new-array v3, v2, [Ljava/lang/String;

    invoke-static {v0, v3}, Lf5/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-static {v0}, Ls3/a0$a;->C([Ljava/lang/String;)Lg5/q;

    move-result-object v0

    iput-object v0, p0, Ls3/a0$a;->s:Lg5/q;

    invoke-static {}, Ls3/a0;->l()Ljava/lang/String;

    move-result-object v0

    iget v3, v1, Ls3/a0;->G:I

    invoke-virtual {p1, v0, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ls3/a0$a;->t:I

    invoke-static {}, Ls3/a0;->n()Ljava/lang/String;

    move-result-object v0

    iget v3, v1, Ls3/a0;->H:I

    invoke-virtual {p1, v0, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ls3/a0$a;->u:I

    invoke-static {}, Ls3/a0;->o()Ljava/lang/String;

    move-result-object v0

    iget-boolean v3, v1, Ls3/a0;->I:Z

    invoke-virtual {p1, v0, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Ls3/a0$a;->v:Z

    invoke-static {}, Ls3/a0;->p()Ljava/lang/String;

    move-result-object v0

    iget-boolean v3, v1, Ls3/a0;->J:Z

    invoke-virtual {p1, v0, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Ls3/a0$a;->w:Z

    invoke-static {}, Ls3/a0;->q()Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, v1, Ls3/a0;->K:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Ls3/a0$a;->x:Z

    invoke-static {}, Ls3/a0;->r()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lg5/q;->J()Lg5/q;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v1, Ls3/y;->r:Lx1/h$a;

    invoke-static {v1, v0}, Lu3/c;->b(Lx1/h$a;Ljava/util/List;)Lg5/q;

    move-result-object v0

    :goto_0
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Ls3/a0$a;->y:Ljava/util/HashMap;

    move v1, v2

    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ls3/y;

    iget-object v4, p0, Ls3/a0$a;->y:Ljava/util/HashMap;

    iget-object v5, v3, Ls3/y;->n:Lz2/t0;

    invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    invoke-static {}, Ls3/a0;->s()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object p1

    new-array v0, v2, [I

    invoke-static {p1, v0}, Lf5/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ls3/a0$a;->z:Ljava/util/HashSet;

    array-length v0, p1

    :goto_2
    if-ge v2, v0, :cond_2

    aget v1, p1, v2

    iget-object v3, p0, Ls3/a0$a;->z:Ljava/util/HashSet;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method protected constructor <init>(Ls3/a0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0, p1}, Ls3/a0$a;->B(Ls3/a0;)V

    return-void
.end method

.method private B(Ls3/a0;)V
    .locals 2
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull;
        value = {
            "preferredVideoMimeTypes",
            "preferredAudioLanguages",
            "preferredAudioMimeTypes",
            "preferredTextLanguages",
            "overrides",
            "disabledTrackTypes"
        }
    .end annotation

    iget v0, p1, Ls3/a0;->n:I

    iput v0, p0, Ls3/a0$a;->a:I

    iget v0, p1, Ls3/a0;->o:I

    iput v0, p0, Ls3/a0$a;->b:I

    iget v0, p1, Ls3/a0;->p:I

    iput v0, p0, Ls3/a0$a;->c:I

    iget v0, p1, Ls3/a0;->q:I

    iput v0, p0, Ls3/a0$a;->d:I

    iget v0, p1, Ls3/a0;->r:I

    iput v0, p0, Ls3/a0$a;->e:I

    iget v0, p1, Ls3/a0;->s:I

    iput v0, p0, Ls3/a0$a;->f:I

    iget v0, p1, Ls3/a0;->t:I

    iput v0, p0, Ls3/a0$a;->g:I

    iget v0, p1, Ls3/a0;->u:I

    iput v0, p0, Ls3/a0$a;->h:I

    iget v0, p1, Ls3/a0;->v:I

    iput v0, p0, Ls3/a0$a;->i:I

    iget v0, p1, Ls3/a0;->w:I

    iput v0, p0, Ls3/a0$a;->j:I

    iget-boolean v0, p1, Ls3/a0;->x:Z

    iput-boolean v0, p0, Ls3/a0$a;->k:Z

    iget-object v0, p1, Ls3/a0;->y:Lg5/q;

    iput-object v0, p0, Ls3/a0$a;->l:Lg5/q;

    iget v0, p1, Ls3/a0;->z:I

    iput v0, p0, Ls3/a0$a;->m:I

    iget-object v0, p1, Ls3/a0;->A:Lg5/q;

    iput-object v0, p0, Ls3/a0$a;->n:Lg5/q;

    iget v0, p1, Ls3/a0;->B:I

    iput v0, p0, Ls3/a0$a;->o:I

    iget v0, p1, Ls3/a0;->C:I

    iput v0, p0, Ls3/a0$a;->p:I

    iget v0, p1, Ls3/a0;->D:I

    iput v0, p0, Ls3/a0$a;->q:I

    iget-object v0, p1, Ls3/a0;->E:Lg5/q;

    iput-object v0, p0, Ls3/a0$a;->r:Lg5/q;

    iget-object v0, p1, Ls3/a0;->F:Lg5/q;

    iput-object v0, p0, Ls3/a0$a;->s:Lg5/q;

    iget v0, p1, Ls3/a0;->G:I

    iput v0, p0, Ls3/a0$a;->t:I

    iget v0, p1, Ls3/a0;->H:I

    iput v0, p0, Ls3/a0$a;->u:I

    iget-boolean v0, p1, Ls3/a0;->I:Z

    iput-boolean v0, p0, Ls3/a0$a;->v:Z

    iget-boolean v0, p1, Ls3/a0;->J:Z

    iput-boolean v0, p0, Ls3/a0$a;->w:Z

    iget-boolean v0, p1, Ls3/a0;->K:Z

    iput-boolean v0, p0, Ls3/a0$a;->x:Z

    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p1, Ls3/a0;->M:Lg5/s;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ls3/a0$a;->z:Ljava/util/HashSet;

    new-instance v0, Ljava/util/HashMap;

    iget-object p1, p1, Ls3/a0;->L:Lg5/r;

    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Ls3/a0$a;->y:Ljava/util/HashMap;

    return-void
.end method

.method private static C([Ljava/lang/String;)Lg5/q;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Lg5/q<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lg5/q;->D()Lg5/q$a;

    move-result-object v0

    invoke-static {p0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/String;

    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p0, v2

    invoke-static {v3}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lu3/n0;->D0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lg5/q$a;->f(Ljava/lang/Object;)Lg5/q$a;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lg5/q$a;->h()Lg5/q;

    move-result-object p0

    return-object p0
.end method

.method private F(Landroid/content/Context;)V
    .locals 2

    sget v0, Lu3/n0;->a:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "captioning"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/accessibility/CaptioningManager;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/view/accessibility/CaptioningManager;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/16 v0, 0x440

    iput v0, p0, Ls3/a0$a;->t:I

    invoke-virtual {p1}, Landroid/view/accessibility/CaptioningManager;->getLocale()Ljava/util/Locale;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-static {p1}, Lu3/n0;->X(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lg5/q;->K(Ljava/lang/Object;)Lg5/q;

    move-result-object p1

    iput-object p1, p0, Ls3/a0$a;->s:Lg5/q;

    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic a(Ls3/a0$a;)I
    .locals 0

    iget p0, p0, Ls3/a0$a;->a:I

    return p0
.end method

.method static synthetic b(Ls3/a0$a;)I
    .locals 0

    iget p0, p0, Ls3/a0$a;->b:I

    return p0
.end method

.method static synthetic c(Ls3/a0$a;)I
    .locals 0

    iget p0, p0, Ls3/a0$a;->c:I

    return p0
.end method

.method static synthetic d(Ls3/a0$a;)I
    .locals 0

    iget p0, p0, Ls3/a0$a;->d:I

    return p0
.end method

.method static synthetic e(Ls3/a0$a;)I
    .locals 0

    iget p0, p0, Ls3/a0$a;->e:I

    return p0
.end method

.method static synthetic f(Ls3/a0$a;)I
    .locals 0

    iget p0, p0, Ls3/a0$a;->f:I

    return p0
.end method

.method static synthetic g(Ls3/a0$a;)I
    .locals 0

    iget p0, p0, Ls3/a0$a;->g:I

    return p0
.end method

.method static synthetic h(Ls3/a0$a;)I
    .locals 0

    iget p0, p0, Ls3/a0$a;->h:I

    return p0
.end method

.method static synthetic i(Ls3/a0$a;)I
    .locals 0

    iget p0, p0, Ls3/a0$a;->i:I

    return p0
.end method

.method static synthetic j(Ls3/a0$a;)I
    .locals 0

    iget p0, p0, Ls3/a0$a;->j:I

    return p0
.end method

.method static synthetic k(Ls3/a0$a;)Z
    .locals 0

    iget-boolean p0, p0, Ls3/a0$a;->k:Z

    return p0
.end method

.method static synthetic l(Ls3/a0$a;)Lg5/q;
    .locals 0

    iget-object p0, p0, Ls3/a0$a;->l:Lg5/q;

    return-object p0
.end method

.method static synthetic m(Ls3/a0$a;)I
    .locals 0

    iget p0, p0, Ls3/a0$a;->m:I

    return p0
.end method

.method static synthetic n(Ls3/a0$a;)Lg5/q;
    .locals 0

    iget-object p0, p0, Ls3/a0$a;->n:Lg5/q;

    return-object p0
.end method

.method static synthetic o(Ls3/a0$a;)I
    .locals 0

    iget p0, p0, Ls3/a0$a;->o:I

    return p0
.end method

.method static synthetic p(Ls3/a0$a;)I
    .locals 0

    iget p0, p0, Ls3/a0$a;->p:I

    return p0
.end method

.method static synthetic q(Ls3/a0$a;)I
    .locals 0

    iget p0, p0, Ls3/a0$a;->q:I

    return p0
.end method

.method static synthetic r(Ls3/a0$a;)Lg5/q;
    .locals 0

    iget-object p0, p0, Ls3/a0$a;->r:Lg5/q;

    return-object p0
.end method

.method static synthetic s(Ls3/a0$a;)Lg5/q;
    .locals 0

    iget-object p0, p0, Ls3/a0$a;->s:Lg5/q;

    return-object p0
.end method

.method static synthetic t(Ls3/a0$a;)I
    .locals 0

    iget p0, p0, Ls3/a0$a;->t:I

    return p0
.end method

.method static synthetic u(Ls3/a0$a;)I
    .locals 0

    iget p0, p0, Ls3/a0$a;->u:I

    return p0
.end method

.method static synthetic v(Ls3/a0$a;)Z
    .locals 0

    iget-boolean p0, p0, Ls3/a0$a;->v:Z

    return p0
.end method

.method static synthetic w(Ls3/a0$a;)Z
    .locals 0

    iget-boolean p0, p0, Ls3/a0$a;->w:Z

    return p0
.end method

.method static synthetic x(Ls3/a0$a;)Z
    .locals 0

    iget-boolean p0, p0, Ls3/a0$a;->x:Z

    return p0
.end method

.method static synthetic y(Ls3/a0$a;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, Ls3/a0$a;->y:Ljava/util/HashMap;

    return-object p0
.end method

.method static synthetic z(Ls3/a0$a;)Ljava/util/HashSet;
    .locals 0

    iget-object p0, p0, Ls3/a0$a;->z:Ljava/util/HashSet;

    return-object p0
.end method


# virtual methods
.method public A()Ls3/a0;
    .locals 1

    new-instance v0, Ls3/a0;

    invoke-direct {v0, p0}, Ls3/a0;-><init>(Ls3/a0$a;)V

    return-object v0
.end method

.method protected D(Ls3/a0;)Ls3/a0$a;
    .locals 0

    invoke-direct {p0, p1}, Ls3/a0$a;->B(Ls3/a0;)V

    return-object p0
.end method

.method public E(Landroid/content/Context;)Ls3/a0$a;
    .locals 2

    sget v0, Lu3/n0;->a:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    invoke-direct {p0, p1}, Ls3/a0$a;->F(Landroid/content/Context;)V

    :cond_0
    return-object p0
.end method

.method public G(IIZ)Ls3/a0$a;
    .locals 0

    iput p1, p0, Ls3/a0$a;->i:I

    iput p2, p0, Ls3/a0$a;->j:I

    iput-boolean p3, p0, Ls3/a0$a;->k:Z

    return-object p0
.end method

.method public H(Landroid/content/Context;Z)Ls3/a0$a;
    .locals 1

    invoke-static {p1}, Lu3/n0;->O(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object p1

    iget v0, p1, Landroid/graphics/Point;->x:I

    iget p1, p1, Landroid/graphics/Point;->y:I

    invoke-virtual {p0, v0, p1, p2}, Ls3/a0$a;->G(IIZ)Ls3/a0$a;

    move-result-object p1

    return-object p1
.end method
