.class public final Lf5/n;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf5/n$b;,
        Lf5/n$c;
    }
.end annotation


# instance fields
.field private final a:Lf5/c;

.field private final b:Z

.field private final c:Lf5/n$c;

.field private final d:I


# direct methods
.method private constructor <init>(Lf5/n$c;)V
    .locals 3

    invoke-static {}, Lf5/c;->f()Lf5/c;

    move-result-object v0

    const/4 v1, 0x0

    const v2, 0x7fffffff

    invoke-direct {p0, p1, v1, v0, v2}, Lf5/n;-><init>(Lf5/n$c;ZLf5/c;I)V

    return-void
.end method

.method private constructor <init>(Lf5/n$c;ZLf5/c;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf5/n;->c:Lf5/n$c;

    iput-boolean p2, p0, Lf5/n;->b:Z

    iput-object p3, p0, Lf5/n;->a:Lf5/c;

    iput p4, p0, Lf5/n;->d:I

    return-void
.end method

.method static synthetic a(Lf5/n;)Lf5/c;
    .locals 0

    iget-object p0, p0, Lf5/n;->a:Lf5/c;

    return-object p0
.end method

.method static synthetic b(Lf5/n;)Z
    .locals 0

    iget-boolean p0, p0, Lf5/n;->b:Z

    return p0
.end method

.method static synthetic c(Lf5/n;)I
    .locals 0

    iget p0, p0, Lf5/n;->d:I

    return p0
.end method

.method public static d(C)Lf5/n;
    .locals 0

    invoke-static {p0}, Lf5/c;->d(C)Lf5/c;

    move-result-object p0

    invoke-static {p0}, Lf5/n;->e(Lf5/c;)Lf5/n;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lf5/c;)Lf5/n;
    .locals 2

    invoke-static {p0}, Lf5/k;->i(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lf5/n;

    new-instance v1, Lf5/n$a;

    invoke-direct {v1, p0}, Lf5/n$a;-><init>(Lf5/c;)V

    invoke-direct {v0, v1}, Lf5/n;-><init>(Lf5/n$c;)V

    return-object v0
.end method

.method private g(Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            ")",
            "Ljava/util/Iterator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lf5/n;->c:Lf5/n$c;

    invoke-interface {v0, p0, p1}, Lf5/n$c;->a(Lf5/n;Ljava/lang/CharSequence;)Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public f(Ljava/lang/CharSequence;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lf5/k;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0, p1}, Lf5/n;->g(Ljava/lang/CharSequence;)Ljava/util/Iterator;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
