.class public final Lf7/e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf7/e$f;
    }
.end annotation


# static fields
.field private static final x:Lm7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm7/a<",
            "*>;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/util/Map<",
            "Lm7/a<",
            "*>;",
            "Lf7/e$f<",
            "*>;>;>;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lm7/a<",
            "*>;",
            "Lf7/w<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final c:Lh7/c;

.field private final d:Li7/e;

.field final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lf7/x;",
            ">;"
        }
    .end annotation
.end field

.field final f:Lh7/d;

.field final g:Lf7/d;

.field final h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/reflect/Type;",
            "Lf7/g<",
            "*>;>;"
        }
    .end annotation
.end field

.field final i:Z

.field final j:Z

.field final k:Z

.field final l:Z

.field final m:Z

.field final n:Z

.field final o:Z

.field final p:Ljava/lang/String;

.field final q:I

.field final r:I

.field final s:Lf7/t;

.field final t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lf7/x;",
            ">;"
        }
    .end annotation
.end field

.field final u:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lf7/x;",
            ">;"
        }
    .end annotation
.end field

.field final v:Lf7/v;

.field final w:Lf7/v;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Ljava/lang/Object;

    invoke-static {v0}, Lm7/a;->a(Ljava/lang/Class;)Lm7/a;

    move-result-object v0

    sput-object v0, Lf7/e;->x:Lm7/a;

    return-void
.end method

.method constructor <init>(Lh7/d;Lf7/d;Ljava/util/Map;ZZZZZZZLf7/t;Ljava/lang/String;IILjava/util/List;Ljava/util/List;Ljava/util/List;Lf7/v;Lf7/v;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh7/d;",
            "Lf7/d;",
            "Ljava/util/Map<",
            "Ljava/lang/reflect/Type;",
            "Lf7/g<",
            "*>;>;ZZZZZZZ",
            "Lf7/t;",
            "Ljava/lang/String;",
            "II",
            "Ljava/util/List<",
            "Lf7/x;",
            ">;",
            "Ljava/util/List<",
            "Lf7/x;",
            ">;",
            "Ljava/util/List<",
            "Lf7/x;",
            ">;",
            "Lf7/v;",
            "Lf7/v;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move/from16 v4, p5

    move/from16 v5, p10

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v6, Ljava/lang/ThreadLocal;

    invoke-direct {v6}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v6, v0, Lf7/e;->a:Ljava/lang/ThreadLocal;

    new-instance v6, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {v6}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v6, v0, Lf7/e;->b:Ljava/util/Map;

    iput-object v1, v0, Lf7/e;->f:Lh7/d;

    iput-object v2, v0, Lf7/e;->g:Lf7/d;

    iput-object v3, v0, Lf7/e;->h:Ljava/util/Map;

    new-instance v6, Lh7/c;

    invoke-direct {v6, p3}, Lh7/c;-><init>(Ljava/util/Map;)V

    iput-object v6, v0, Lf7/e;->c:Lh7/c;

    move/from16 v3, p4

    iput-boolean v3, v0, Lf7/e;->i:Z

    iput-boolean v4, v0, Lf7/e;->j:Z

    move/from16 v3, p6

    iput-boolean v3, v0, Lf7/e;->k:Z

    move/from16 v3, p7

    iput-boolean v3, v0, Lf7/e;->l:Z

    move/from16 v3, p8

    iput-boolean v3, v0, Lf7/e;->m:Z

    move/from16 v3, p9

    iput-boolean v3, v0, Lf7/e;->n:Z

    iput-boolean v5, v0, Lf7/e;->o:Z

    move-object/from16 v3, p11

    iput-object v3, v0, Lf7/e;->s:Lf7/t;

    move-object/from16 v7, p12

    iput-object v7, v0, Lf7/e;->p:Ljava/lang/String;

    move/from16 v7, p13

    iput v7, v0, Lf7/e;->q:I

    move/from16 v7, p14

    iput v7, v0, Lf7/e;->r:I

    move-object/from16 v7, p15

    iput-object v7, v0, Lf7/e;->t:Ljava/util/List;

    move-object/from16 v7, p16

    iput-object v7, v0, Lf7/e;->u:Ljava/util/List;

    move-object/from16 v7, p18

    iput-object v7, v0, Lf7/e;->v:Lf7/v;

    move-object/from16 v8, p19

    iput-object v8, v0, Lf7/e;->w:Lf7/v;

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    sget-object v10, Li7/n;->V:Lf7/x;

    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static/range {p18 .. p18}, Li7/j;->f(Lf7/v;)Lf7/x;

    move-result-object v7

    invoke-interface {v9, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v9, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v7, p17

    invoke-interface {v9, v7}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    sget-object v7, Li7/n;->B:Lf7/x;

    invoke-interface {v9, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v7, Li7/n;->m:Lf7/x;

    invoke-interface {v9, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v7, Li7/n;->g:Lf7/x;

    invoke-interface {v9, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v7, Li7/n;->i:Lf7/x;

    invoke-interface {v9, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v7, Li7/n;->k:Lf7/x;

    invoke-interface {v9, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static/range {p11 .. p11}, Lf7/e;->m(Lf7/t;)Lf7/w;

    move-result-object v3

    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const-class v10, Ljava/lang/Long;

    invoke-static {v7, v10, v3}, Li7/n;->b(Ljava/lang/Class;Ljava/lang/Class;Lf7/w;)Lf7/x;

    move-result-object v7

    invoke-interface {v9, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v7, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    const-class v10, Ljava/lang/Double;

    invoke-direct {p0, v5}, Lf7/e;->e(Z)Lf7/w;

    move-result-object v11

    invoke-static {v7, v10, v11}, Li7/n;->b(Ljava/lang/Class;Ljava/lang/Class;Lf7/w;)Lf7/x;

    move-result-object v7

    invoke-interface {v9, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v7, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    const-class v10, Ljava/lang/Float;

    invoke-direct {p0, v5}, Lf7/e;->f(Z)Lf7/w;

    move-result-object v5

    invoke-static {v7, v10, v5}, Li7/n;->b(Ljava/lang/Class;Ljava/lang/Class;Lf7/w;)Lf7/x;

    move-result-object v5

    invoke-interface {v9, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static/range {p19 .. p19}, Li7/i;->f(Lf7/v;)Lf7/x;

    move-result-object v5

    invoke-interface {v9, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v5, Li7/n;->o:Lf7/x;

    invoke-interface {v9, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v5, Li7/n;->q:Lf7/x;

    invoke-interface {v9, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-class v5, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v3}, Lf7/e;->b(Lf7/w;)Lf7/w;

    move-result-object v7

    invoke-static {v5, v7}, Li7/n;->a(Ljava/lang/Class;Lf7/w;)Lf7/x;

    move-result-object v5

    invoke-interface {v9, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-class v5, Ljava/util/concurrent/atomic/AtomicLongArray;

    invoke-static {v3}, Lf7/e;->c(Lf7/w;)Lf7/w;

    move-result-object v3

    invoke-static {v5, v3}, Li7/n;->a(Ljava/lang/Class;Lf7/w;)Lf7/x;

    move-result-object v3

    invoke-interface {v9, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v3, Li7/n;->s:Lf7/x;

    invoke-interface {v9, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v3, Li7/n;->x:Lf7/x;

    invoke-interface {v9, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v3, Li7/n;->D:Lf7/x;

    invoke-interface {v9, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v3, Li7/n;->F:Lf7/x;

    invoke-interface {v9, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-class v3, Ljava/math/BigDecimal;

    sget-object v5, Li7/n;->z:Lf7/w;

    invoke-static {v3, v5}, Li7/n;->a(Ljava/lang/Class;Lf7/w;)Lf7/x;

    move-result-object v3

    invoke-interface {v9, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-class v3, Ljava/math/BigInteger;

    sget-object v5, Li7/n;->A:Lf7/w;

    invoke-static {v3, v5}, Li7/n;->a(Ljava/lang/Class;Lf7/w;)Lf7/x;

    move-result-object v3

    invoke-interface {v9, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v3, Li7/n;->H:Lf7/x;

    invoke-interface {v9, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v3, Li7/n;->J:Lf7/x;

    invoke-interface {v9, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v3, Li7/n;->N:Lf7/x;

    invoke-interface {v9, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v3, Li7/n;->P:Lf7/x;

    invoke-interface {v9, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v3, Li7/n;->T:Lf7/x;

    invoke-interface {v9, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v3, Li7/n;->L:Lf7/x;

    invoke-interface {v9, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v3, Li7/n;->d:Lf7/x;

    invoke-interface {v9, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v3, Li7/c;->b:Lf7/x;

    invoke-interface {v9, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v3, Li7/n;->R:Lf7/x;

    invoke-interface {v9, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-boolean v3, Ll7/d;->a:Z

    if-eqz v3, :cond_0

    sget-object v3, Ll7/d;->e:Lf7/x;

    invoke-interface {v9, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v3, Ll7/d;->d:Lf7/x;

    invoke-interface {v9, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v3, Ll7/d;->f:Lf7/x;

    invoke-interface {v9, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    sget-object v3, Li7/a;->c:Lf7/x;

    invoke-interface {v9, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v3, Li7/n;->b:Lf7/x;

    invoke-interface {v9, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v3, Li7/b;

    invoke-direct {v3, v6}, Li7/b;-><init>(Lh7/c;)V

    invoke-interface {v9, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v3, Li7/h;

    invoke-direct {v3, v6, v4}, Li7/h;-><init>(Lh7/c;Z)V

    invoke-interface {v9, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v3, Li7/e;

    invoke-direct {v3, v6}, Li7/e;-><init>(Lh7/c;)V

    iput-object v3, v0, Lf7/e;->d:Li7/e;

    invoke-interface {v9, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v4, Li7/n;->W:Lf7/x;

    invoke-interface {v9, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v4, Li7/k;

    invoke-direct {v4, v6, p2, p1, v3}, Li7/k;-><init>(Lh7/c;Lf7/d;Lh7/d;Li7/e;)V

    invoke-interface {v9, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v9}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Lf7/e;->e:Ljava/util/List;

    return-void
.end method

.method private static a(Ljava/lang/Object;Ln7/a;)V
    .locals 0

    if-eqz p0, :cond_1

    :try_start_0
    invoke-virtual {p1}, Ln7/a;->Z()Ln7/b;

    move-result-object p0

    sget-object p1, Ln7/b;->w:Ln7/b;

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Lf7/l;

    const-string p1, "JSON document was not fully consumed."

    invoke-direct {p0, p1}, Lf7/l;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ln7/d; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    new-instance p1, Lf7/l;

    invoke-direct {p1, p0}, Lf7/l;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :catch_1
    move-exception p0

    new-instance p1, Lf7/s;

    invoke-direct {p1, p0}, Lf7/s;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method private static b(Lf7/w;)Lf7/w;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf7/w<",
            "Ljava/lang/Number;",
            ">;)",
            "Lf7/w<",
            "Ljava/util/concurrent/atomic/AtomicLong;",
            ">;"
        }
    .end annotation

    new-instance v0, Lf7/e$d;

    invoke-direct {v0, p0}, Lf7/e$d;-><init>(Lf7/w;)V

    invoke-virtual {v0}, Lf7/w;->b()Lf7/w;

    move-result-object p0

    return-object p0
.end method

.method private static c(Lf7/w;)Lf7/w;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf7/w<",
            "Ljava/lang/Number;",
            ">;)",
            "Lf7/w<",
            "Ljava/util/concurrent/atomic/AtomicLongArray;",
            ">;"
        }
    .end annotation

    new-instance v0, Lf7/e$e;

    invoke-direct {v0, p0}, Lf7/e$e;-><init>(Lf7/w;)V

    invoke-virtual {v0}, Lf7/w;->b()Lf7/w;

    move-result-object p0

    return-object p0
.end method

.method static d(D)V
    .locals 2

    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0, p1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p0, " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private e(Z)Lf7/w;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lf7/w<",
            "Ljava/lang/Number;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_0

    sget-object p1, Li7/n;->v:Lf7/w;

    return-object p1

    :cond_0
    new-instance p1, Lf7/e$a;

    invoke-direct {p1, p0}, Lf7/e$a;-><init>(Lf7/e;)V

    return-object p1
.end method

.method private f(Z)Lf7/w;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lf7/w<",
            "Ljava/lang/Number;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_0

    sget-object p1, Li7/n;->u:Lf7/w;

    return-object p1

    :cond_0
    new-instance p1, Lf7/e$b;

    invoke-direct {p1, p0}, Lf7/e$b;-><init>(Lf7/e;)V

    return-object p1
.end method

.method private static m(Lf7/t;)Lf7/w;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf7/t;",
            ")",
            "Lf7/w<",
            "Ljava/lang/Number;",
            ">;"
        }
    .end annotation

    sget-object v0, Lf7/t;->n:Lf7/t;

    if-ne p0, v0, :cond_0

    sget-object p0, Li7/n;->t:Lf7/w;

    return-object p0

    :cond_0
    new-instance p0, Lf7/e$c;

    invoke-direct {p0}, Lf7/e$c;-><init>()V

    return-object p0
.end method


# virtual methods
.method public g(Ljava/io/Reader;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/io/Reader;",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lf7/e;->n(Ljava/io/Reader;)Ln7/a;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lf7/e;->i(Ln7/a;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, p1}, Lf7/e;->a(Ljava/lang/Object;Ln7/a;)V

    return-object p2
.end method

.method public h(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Ljava/io/StringReader;

    invoke-direct {v0, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0, p2}, Lf7/e;->g(Ljava/io/Reader;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public i(Ln7/a;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ln7/a;",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    invoke-virtual {p1}, Ln7/a;->t()Z

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ln7/a;->e0(Z)V

    :try_start_0
    invoke-virtual {p1}, Ln7/a;->Z()Ln7/b;

    const/4 v1, 0x0

    invoke-static {p2}, Lm7/a;->b(Ljava/lang/reflect/Type;)Lm7/a;

    move-result-object p2

    invoke-virtual {p0, p2}, Lf7/e;->k(Lm7/a;)Lf7/w;

    move-result-object p2

    invoke-virtual {p2, p1}, Lf7/w;->c(Ln7/a;)Ljava/lang/Object;

    move-result-object p2
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1, v0}, Ln7/a;->e0(Z)V

    return-object p2

    :catchall_0
    move-exception p2

    goto :goto_0

    :catch_0
    move-exception p2

    :try_start_1
    new-instance v1, Ljava/lang/AssertionError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AssertionError (GSON 2.8.9): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/AssertionError;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, p2}, Ljava/lang/AssertionError;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v1

    :catch_1
    move-exception p2

    new-instance v1, Lf7/s;

    invoke-direct {v1, p2}, Lf7/s;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_2
    move-exception p2

    new-instance v1, Lf7/s;

    invoke-direct {v1, p2}, Lf7/s;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_3
    move-exception p2

    if-eqz v1, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, v0}, Ln7/a;->e0(Z)V

    return-object p2

    :cond_0
    :try_start_2
    new-instance v1, Lf7/s;

    invoke-direct {v1, p2}, Lf7/s;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    invoke-virtual {p1, v0}, Ln7/a;->e0(Z)V

    throw p2
.end method

.method public j(Ljava/lang/Class;)Lf7/w;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lf7/w<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Lm7/a;->a(Ljava/lang/Class;)Lm7/a;

    move-result-object p1

    invoke-virtual {p0, p1}, Lf7/e;->k(Lm7/a;)Lf7/w;

    move-result-object p1

    return-object p1
.end method

.method public k(Lm7/a;)Lf7/w;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lm7/a<",
            "TT;>;)",
            "Lf7/w<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lf7/e;->b:Ljava/util/Map;

    if-nez p1, :cond_0

    sget-object v1, Lf7/e;->x:Lm7/a;

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf7/w;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, Lf7/e;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lf7/e;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    const/4 v1, 0x1

    :cond_2
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf7/e$f;

    if-eqz v2, :cond_3

    return-object v2

    :cond_3
    :try_start_0
    new-instance v2, Lf7/e$f;

    invoke-direct {v2}, Lf7/e$f;-><init>()V

    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, Lf7/e;->e:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf7/x;

    invoke-interface {v4, p0, p1}, Lf7/x;->create(Lf7/e;Lm7/a;)Lf7/w;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v2, v4}, Lf7/e$f;->f(Lf7/w;)V

    iget-object v2, p0, Lf7/e;->b:Ljava/util/Map;

    invoke-interface {v2, p1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v1, :cond_5

    iget-object p1, p0, Lf7/e;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->remove()V

    :cond_5
    return-object v4

    :cond_6
    :try_start_1
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "GSON (2.8.9) cannot handle "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v2

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v1, :cond_7

    iget-object p1, p0, Lf7/e;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->remove()V

    :cond_7
    throw v2
.end method

.method public l(Lf7/x;Lm7/a;)Lf7/w;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lf7/x;",
            "Lm7/a<",
            "TT;>;)",
            "Lf7/w<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lf7/e;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p1, p0, Lf7/e;->d:Li7/e;

    :cond_0
    const/4 v0, 0x0

    iget-object v1, p0, Lf7/e;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf7/x;

    if-nez v0, :cond_2

    if-ne v2, p1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    invoke-interface {v2, p0, p2}, Lf7/x;->create(Lf7/e;Lm7/a;)Lf7/w;

    move-result-object v2

    if-eqz v2, :cond_1

    return-object v2

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GSON cannot serialize "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public n(Ljava/io/Reader;)Ln7/a;
    .locals 1

    new-instance v0, Ln7/a;

    invoke-direct {v0, p1}, Ln7/a;-><init>(Ljava/io/Reader;)V

    iget-boolean p1, p0, Lf7/e;->n:Z

    invoke-virtual {v0, p1}, Ln7/a;->e0(Z)V

    return-object v0
.end method

.method public o(Ljava/io/Writer;)Ln7/c;
    .locals 1

    iget-boolean v0, p0, Lf7/e;->k:Z

    if-eqz v0, :cond_0

    const-string v0, ")]}\'\n"

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :cond_0
    new-instance v0, Ln7/c;

    invoke-direct {v0, p1}, Ln7/c;-><init>(Ljava/io/Writer;)V

    iget-boolean p1, p0, Lf7/e;->m:Z

    if-eqz p1, :cond_1

    const-string p1, "  "

    invoke-virtual {v0, p1}, Ln7/c;->S(Ljava/lang/String;)V

    :cond_1
    iget-boolean p1, p0, Lf7/e;->i:Z

    invoke-virtual {v0, p1}, Ln7/c;->X(Z)V

    return-object v0
.end method

.method public p(Lf7/k;)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    invoke-virtual {p0, p1, v0}, Lf7/e;->s(Lf7/k;Ljava/lang/Appendable;)V

    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public q(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    sget-object p1, Lf7/m;->a:Lf7/m;

    invoke-virtual {p0, p1}, Lf7/e;->p(Lf7/k;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lf7/e;->r(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public r(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    invoke-virtual {p0, p1, p2, v0}, Lf7/e;->u(Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Appendable;)V

    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public s(Lf7/k;Ljava/lang/Appendable;)V
    .locals 0

    :try_start_0
    invoke-static {p2}, Lh7/l;->c(Ljava/lang/Appendable;)Ljava/io/Writer;

    move-result-object p2

    invoke-virtual {p0, p2}, Lf7/e;->o(Ljava/io/Writer;)Ln7/c;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lf7/e;->t(Lf7/k;Ln7/c;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lf7/l;

    invoke-direct {p2, p1}, Lf7/l;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public t(Lf7/k;Ln7/c;)V
    .locals 6

    invoke-virtual {p2}, Ln7/c;->t()Z

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p2, v1}, Ln7/c;->W(Z)V

    invoke-virtual {p2}, Ln7/c;->r()Z

    move-result v1

    iget-boolean v2, p0, Lf7/e;->l:Z

    invoke-virtual {p2, v2}, Ln7/c;->R(Z)V

    invoke-virtual {p2}, Ln7/c;->p()Z

    move-result v2

    iget-boolean v3, p0, Lf7/e;->i:Z

    invoke-virtual {p2, v3}, Ln7/c;->X(Z)V

    :try_start_0
    invoke-static {p1, p2}, Lh7/l;->b(Lf7/k;Ln7/c;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p2, v0}, Ln7/c;->W(Z)V

    invoke-virtual {p2, v1}, Ln7/c;->R(Z)V

    invoke-virtual {p2, v2}, Ln7/c;->X(Z)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    new-instance v3, Ljava/lang/AssertionError;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "AssertionError (GSON 2.8.9): "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/AssertionError;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v3, p1}, Ljava/lang/AssertionError;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v3

    :catch_1
    move-exception p1

    new-instance v3, Lf7/l;

    invoke-direct {v3, p1}, Lf7/l;-><init>(Ljava/lang/Throwable;)V

    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    invoke-virtual {p2, v0}, Ln7/c;->W(Z)V

    invoke-virtual {p2, v1}, Ln7/c;->R(Z)V

    invoke-virtual {p2, v2}, Ln7/c;->X(Z)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{serializeNulls:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Lf7/e;->i:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",factories:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf7/e;->e:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",instanceCreators:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf7/e;->c:Lh7/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Appendable;)V
    .locals 0

    :try_start_0
    invoke-static {p3}, Lh7/l;->c(Ljava/lang/Appendable;)Ljava/io/Writer;

    move-result-object p3

    invoke-virtual {p0, p3}, Lf7/e;->o(Ljava/io/Writer;)Ln7/c;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, Lf7/e;->v(Ljava/lang/Object;Ljava/lang/reflect/Type;Ln7/c;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lf7/l;

    invoke-direct {p2, p1}, Lf7/l;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public v(Ljava/lang/Object;Ljava/lang/reflect/Type;Ln7/c;)V
    .locals 5

    invoke-static {p2}, Lm7/a;->b(Ljava/lang/reflect/Type;)Lm7/a;

    move-result-object p2

    invoke-virtual {p0, p2}, Lf7/e;->k(Lm7/a;)Lf7/w;

    move-result-object p2

    invoke-virtual {p3}, Ln7/c;->t()Z

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p3, v1}, Ln7/c;->W(Z)V

    invoke-virtual {p3}, Ln7/c;->r()Z

    move-result v1

    iget-boolean v2, p0, Lf7/e;->l:Z

    invoke-virtual {p3, v2}, Ln7/c;->R(Z)V

    invoke-virtual {p3}, Ln7/c;->p()Z

    move-result v2

    iget-boolean v3, p0, Lf7/e;->i:Z

    invoke-virtual {p3, v3}, Ln7/c;->X(Z)V

    :try_start_0
    invoke-virtual {p2, p3, p1}, Lf7/w;->e(Ln7/c;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p3, v0}, Ln7/c;->W(Z)V

    invoke-virtual {p3, v1}, Ln7/c;->R(Z)V

    invoke-virtual {p3, v2}, Ln7/c;->X(Z)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    new-instance p2, Ljava/lang/AssertionError;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "AssertionError (GSON 2.8.9): "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/AssertionError;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p2, v3}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p2, p1}, Ljava/lang/AssertionError;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw p2

    :catch_1
    move-exception p1

    new-instance p2, Lf7/l;

    invoke-direct {p2, p1}, Lf7/l;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    invoke-virtual {p3, v0}, Ln7/c;->W(Z)V

    invoke-virtual {p3, v1}, Ln7/c;->R(Z)V

    invoke-virtual {p3, v2}, Ln7/c;->X(Z)V

    throw p1
.end method
