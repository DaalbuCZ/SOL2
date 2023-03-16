.class public final Lf7/f;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private a:Lh7/d;

.field private b:Lf7/t;

.field private c:Lf7/d;

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/reflect/Type;",
            "Lf7/g<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lf7/x;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lf7/x;",
            ">;"
        }
    .end annotation
.end field

.field private g:Z

.field private h:Ljava/lang/String;

.field private i:I

.field private j:I

.field private k:Z

.field private l:Z

.field private m:Z

.field private n:Z

.field private o:Z

.field private p:Z

.field private q:Lf7/v;

.field private r:Lf7/v;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lh7/d;->t:Lh7/d;

    iput-object v0, p0, Lf7/f;->a:Lh7/d;

    sget-object v0, Lf7/t;->n:Lf7/t;

    iput-object v0, p0, Lf7/f;->b:Lf7/t;

    sget-object v0, Lf7/c;->n:Lf7/c;

    iput-object v0, p0, Lf7/f;->c:Lf7/d;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lf7/f;->d:Ljava/util/Map;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lf7/f;->e:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lf7/f;->f:Ljava/util/List;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lf7/f;->g:Z

    const/4 v1, 0x2

    iput v1, p0, Lf7/f;->i:I

    iput v1, p0, Lf7/f;->j:I

    iput-boolean v0, p0, Lf7/f;->k:Z

    iput-boolean v0, p0, Lf7/f;->l:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lf7/f;->m:Z

    iput-boolean v0, p0, Lf7/f;->n:Z

    iput-boolean v0, p0, Lf7/f;->o:Z

    iput-boolean v0, p0, Lf7/f;->p:Z

    sget-object v0, Lf7/u;->n:Lf7/u;

    iput-object v0, p0, Lf7/f;->q:Lf7/v;

    sget-object v0, Lf7/u;->o:Lf7/u;

    iput-object v0, p0, Lf7/f;->r:Lf7/v;

    return-void
.end method

.method private a(Ljava/lang/String;IILjava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Ljava/util/List<",
            "Lf7/x;",
            ">;)V"
        }
    .end annotation

    sget-boolean v0, Ll7/d;->a:Z

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    sget-object p2, Li7/d$b;->b:Li7/d$b;

    invoke-virtual {p2, p1}, Li7/d$b;->b(Ljava/lang/String;)Lf7/x;

    move-result-object p2

    if-eqz v0, :cond_0

    sget-object p3, Ll7/d;->c:Li7/d$b;

    invoke-virtual {p3, p1}, Li7/d$b;->b(Ljava/lang/String;)Lf7/x;

    move-result-object v1

    sget-object p3, Ll7/d;->b:Li7/d$b;

    invoke-virtual {p3, p1}, Li7/d$b;->b(Ljava/lang/String;)Lf7/x;

    move-result-object p1

    goto :goto_1

    :cond_0
    :goto_0
    move-object p1, v1

    goto :goto_1

    :cond_1
    const/4 p1, 0x2

    if-eq p2, p1, :cond_3

    if-eq p3, p1, :cond_3

    sget-object p1, Li7/d$b;->b:Li7/d$b;

    invoke-virtual {p1, p2, p3}, Li7/d$b;->a(II)Lf7/x;

    move-result-object p1

    if-eqz v0, :cond_2

    sget-object v1, Ll7/d;->c:Li7/d$b;

    invoke-virtual {v1, p2, p3}, Li7/d$b;->a(II)Lf7/x;

    move-result-object v1

    sget-object v2, Ll7/d;->b:Li7/d$b;

    invoke-virtual {v2, p2, p3}, Li7/d$b;->a(II)Lf7/x;

    move-result-object p2

    move-object v3, p2

    move-object p2, p1

    move-object p1, v3

    goto :goto_1

    :cond_2
    move-object p2, p1

    goto :goto_0

    :goto_1
    invoke-interface {p4, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz v0, :cond_3

    invoke-interface {p4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p4, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    return-void
.end method


# virtual methods
.method public b()Lf7/e;
    .locals 23

    move-object/from16 v0, p0

    new-instance v1, Ljava/util/ArrayList;

    move-object/from16 v18, v1

    iget-object v2, v0, Lf7/f;->e:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    iget-object v3, v0, Lf7/f;->f:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v2, v2, 0x3

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v2, v0, Lf7/f;->e:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-static {v1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, v0, Lf7/f;->f:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v2}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v2, v0, Lf7/f;->h:Ljava/lang/String;

    iget v3, v0, Lf7/f;->i:I

    iget v4, v0, Lf7/f;->j:I

    invoke-direct {v0, v2, v3, v4, v1}, Lf7/f;->a(Ljava/lang/String;IILjava/util/List;)V

    new-instance v21, Lf7/e;

    move-object/from16 v1, v21

    iget-object v2, v0, Lf7/f;->a:Lh7/d;

    iget-object v3, v0, Lf7/f;->c:Lf7/d;

    iget-object v4, v0, Lf7/f;->d:Ljava/util/Map;

    iget-boolean v5, v0, Lf7/f;->g:Z

    iget-boolean v6, v0, Lf7/f;->k:Z

    iget-boolean v7, v0, Lf7/f;->o:Z

    iget-boolean v8, v0, Lf7/f;->m:Z

    iget-boolean v9, v0, Lf7/f;->n:Z

    iget-boolean v10, v0, Lf7/f;->p:Z

    iget-boolean v11, v0, Lf7/f;->l:Z

    iget-object v12, v0, Lf7/f;->b:Lf7/t;

    iget-object v13, v0, Lf7/f;->h:Ljava/lang/String;

    iget v14, v0, Lf7/f;->i:I

    iget v15, v0, Lf7/f;->j:I

    move-object/from16 v22, v1

    iget-object v1, v0, Lf7/f;->e:Ljava/util/List;

    move-object/from16 v16, v1

    iget-object v1, v0, Lf7/f;->f:Ljava/util/List;

    move-object/from16 v17, v1

    iget-object v1, v0, Lf7/f;->q:Lf7/v;

    move-object/from16 v19, v1

    iget-object v1, v0, Lf7/f;->r:Lf7/v;

    move-object/from16 v20, v1

    move-object/from16 v1, v22

    invoke-direct/range {v1 .. v20}, Lf7/e;-><init>(Lh7/d;Lf7/d;Ljava/util/Map;ZZZZZZZLf7/t;Ljava/lang/String;IILjava/util/List;Ljava/util/List;Ljava/util/List;Lf7/v;Lf7/v;)V

    return-object v21
.end method

.method public c(Lf7/x;)Lf7/f;
    .locals 1

    iget-object v0, p0, Lf7/f;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method
