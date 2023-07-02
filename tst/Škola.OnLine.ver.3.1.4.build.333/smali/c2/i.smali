.class public final Lc2/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc2/r;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc2/i$a;
    }
.end annotation


# static fields
.field private static final o:[I

.field private static final p:Lc2/i$a;

.field private static final q:Lc2/i$a;


# instance fields
.field private b:Z

.field private c:Z

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:I

.field private l:I

.field private m:Lg5/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg5/q<",
            "Lx1/n1;",
            ">;"
        }
    .end annotation
.end field

.field private n:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x10

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lc2/i;->o:[I

    new-instance v0, Lc2/i$a;

    sget-object v1, Lc2/h;->a:Lc2/h;

    invoke-direct {v0, v1}, Lc2/i$a;-><init>(Lc2/i$a$a;)V

    sput-object v0, Lc2/i;->p:Lc2/i$a;

    new-instance v0, Lc2/i$a;

    sget-object v1, Lc2/g;->a:Lc2/g;

    invoke-direct {v0, v1}, Lc2/i$a;-><init>(Lc2/i$a$a;)V

    sput-object v0, Lc2/i;->q:Lc2/i$a;

    return-void

    :array_0
    .array-data 4
        0x5
        0x4
        0xc
        0x8
        0x3
        0xa
        0x9
        0xb
        0x6
        0x2
        0x0
        0x1
        0x7
        0x10
        0xf
        0xe
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lc2/i;->k:I

    const v0, 0x1b8a0

    iput v0, p0, Lc2/i;->n:I

    invoke-static {}, Lg5/q;->J()Lg5/q;

    move-result-object v0

    iput-object v0, p0, Lc2/i;->m:Lg5/q;

    return-void
.end method

.method public static synthetic c()Ljava/lang/reflect/Constructor;
    .locals 1

    invoke-static {}, Lc2/i;->g()Ljava/lang/reflect/Constructor;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()Ljava/lang/reflect/Constructor;
    .locals 1

    invoke-static {}, Lc2/i;->f()Ljava/lang/reflect/Constructor;

    move-result-object v0

    return-object v0
.end method

.method private e(ILjava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lc2/l;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x2

    const/4 v1, 0x0

    packed-switch p1, :pswitch_data_0

    :pswitch_0
    goto/16 :goto_5

    :pswitch_1
    new-instance p1, Le2/b;

    invoke-direct {p1}, Le2/b;-><init>()V

    goto/16 :goto_4

    :pswitch_2
    sget-object p1, Lc2/i;->q:Lc2/i$a;

    new-array v0, v1, [Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lc2/i$a;->a([Ljava/lang/Object;)Lc2/l;

    move-result-object p1

    if-eqz p1, :cond_4

    goto/16 :goto_1

    :pswitch_3
    new-instance p1, Lh2/a;

    invoke-direct {p1}, Lh2/a;-><init>()V

    goto/16 :goto_4

    :pswitch_4
    new-instance p1, Ln2/b;

    invoke-direct {p1}, Ln2/b;-><init>()V

    goto/16 :goto_4

    :pswitch_5
    new-instance p1, Lm2/h0;

    iget v0, p0, Lc2/i;->k:I

    new-instance v1, Lu3/j0;

    const-wide/16 v2, 0x0

    invoke-direct {v1, v2, v3}, Lu3/j0;-><init>(J)V

    new-instance v2, Lm2/j;

    iget v3, p0, Lc2/i;->l:I

    iget-object v4, p0, Lc2/i;->m:Lg5/q;

    invoke-direct {v2, v3, v4}, Lm2/j;-><init>(ILjava/util/List;)V

    iget v3, p0, Lc2/i;->n:I

    invoke-direct {p1, v0, v1, v2, v3}, Lm2/h0;-><init>(ILu3/j0;Lm2/i0$c;I)V

    goto/16 :goto_4

    :pswitch_6
    new-instance p1, Lm2/a0;

    invoke-direct {p1}, Lm2/a0;-><init>()V

    goto/16 :goto_4

    :pswitch_7
    new-instance p1, Ll2/d;

    invoke-direct {p1}, Ll2/d;-><init>()V

    goto/16 :goto_4

    :pswitch_8
    new-instance p1, Lk2/g;

    iget v0, p0, Lc2/i;->i:I

    invoke-direct {p1, v0}, Lk2/g;-><init>(I)V

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p1, Lk2/k;

    iget v0, p0, Lc2/i;->h:I

    invoke-direct {p1, v0}, Lk2/k;-><init>(I)V

    goto/16 :goto_4

    :pswitch_9
    new-instance p1, Lj2/f;

    iget v2, p0, Lc2/i;->j:I

    iget-boolean v3, p0, Lc2/i;->b:Z

    or-int/2addr v2, v3

    iget-boolean v3, p0, Lc2/i;->c:Z

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, v2

    invoke-direct {p1, v0}, Lj2/f;-><init>(I)V

    goto :goto_4

    :pswitch_a
    new-instance p1, Li2/e;

    iget v0, p0, Lc2/i;->g:I

    invoke-direct {p1, v0}, Li2/e;-><init>(I)V

    goto :goto_4

    :pswitch_b
    new-instance p1, Lg2/c;

    invoke-direct {p1}, Lg2/c;-><init>()V

    goto :goto_4

    :pswitch_c
    sget-object p1, Lc2/i;->p:Lc2/i$a;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iget v2, p0, Lc2/i;->f:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-virtual {p1, v0}, Lc2/i$a;->a([Ljava/lang/Object;)Lc2/l;

    move-result-object p1

    if-eqz p1, :cond_1

    :goto_1
    goto :goto_4

    :cond_1
    new-instance p1, Lf2/d;

    iget v0, p0, Lc2/i;->f:I

    invoke-direct {p1, v0}, Lf2/d;-><init>(I)V

    goto :goto_4

    :pswitch_d
    new-instance p1, Ld2/b;

    iget v2, p0, Lc2/i;->e:I

    iget-boolean v3, p0, Lc2/i;->b:Z

    or-int/2addr v2, v3

    iget-boolean v3, p0, Lc2/i;->c:Z

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    or-int/2addr v0, v2

    invoke-direct {p1, v0}, Ld2/b;-><init>(I)V

    goto :goto_4

    :pswitch_e
    new-instance p1, Lm2/h;

    iget v2, p0, Lc2/i;->d:I

    iget-boolean v3, p0, Lc2/i;->b:Z

    or-int/2addr v2, v3

    iget-boolean v3, p0, Lc2/i;->c:Z

    if-eqz v3, :cond_3

    goto :goto_3

    :cond_3
    move v0, v1

    :goto_3
    or-int/2addr v0, v2

    invoke-direct {p1, v0}, Lm2/h;-><init>(I)V

    goto :goto_4

    :pswitch_f
    new-instance p1, Lm2/e;

    invoke-direct {p1}, Lm2/e;-><init>()V

    goto :goto_4

    :pswitch_10
    new-instance p1, Lm2/b;

    invoke-direct {p1}, Lm2/b;-><init>()V

    :goto_4
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    :goto_5
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method private static f()Ljava/lang/reflect/Constructor;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/reflect/Constructor<",
            "+",
            "Lc2/l;",
            ">;"
        }
    .end annotation

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v1, "com.google.android.exoplayer2.ext.flac.FlacLibrary"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    const-string v4, "isAvailable"

    invoke-virtual {v1, v4, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    new-array v3, v2, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v1, v4, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "com.google.android.exoplayer2.ext.flac.FlacExtractor"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lc2/l;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    return-object v0

    :cond_0
    return-object v4
.end method

.method private static g()Ljava/lang/reflect/Constructor;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/reflect/Constructor<",
            "+",
            "Lc2/l;",
            ">;"
        }
    .end annotation

    const-string v0, "com.google.android.exoplayer2.decoder.midi.MidiExtractor"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lc2/l;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public declared-synchronized a()[Lc2/l;
    .locals 2

    monitor-enter p0

    :try_start_0
    sget-object v0, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0, v0, v1}, Lc2/i;->b(Landroid/net/Uri;Ljava/util/Map;)[Lc2/l;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b(Landroid/net/Uri;Ljava/util/Map;)[Lc2/l;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)[",
            "Lc2/l;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    sget-object v1, Lc2/i;->o:[I

    array-length v2, v1

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-static {p2}, Lu3/k;->b(Ljava/util/Map;)I

    move-result p2

    const/4 v2, -0x1

    if-eq p2, v2, :cond_0

    invoke-direct {p0, p2, v0}, Lc2/i;->e(ILjava/util/List;)V

    :cond_0
    invoke-static {p1}, Lu3/k;->c(Landroid/net/Uri;)I

    move-result p1

    if-eq p1, v2, :cond_1

    if-eq p1, p2, :cond_1

    invoke-direct {p0, p1, v0}, Lc2/i;->e(ILjava/util/List;)V

    :cond_1
    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_3

    aget v4, v1, v3

    if-eq v4, p2, :cond_2

    if-eq v4, p1, :cond_2

    invoke-direct {p0, v4, v0}, Lc2/i;->e(ILjava/util/List;)V

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Lc2/l;

    invoke-interface {v0, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lc2/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
