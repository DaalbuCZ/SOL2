.class public final Ld6/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc6/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld6/d$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc6/b<",
        "Ld6/d;",
        ">;"
    }
.end annotation


# static fields
.field private static final e:Lb6/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb6/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static final f:Lb6/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb6/f<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final g:Lb6/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb6/f<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private static final h:Ld6/d$b;


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lb6/d<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lb6/f<",
            "*>;>;"
        }
    .end annotation
.end field

.field private c:Lb6/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb6/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Ld6/a;->a:Ld6/a;

    sput-object v0, Ld6/d;->e:Lb6/d;

    sget-object v0, Ld6/c;->a:Ld6/c;

    sput-object v0, Ld6/d;->f:Lb6/f;

    sget-object v0, Ld6/b;->a:Ld6/b;

    sput-object v0, Ld6/d;->g:Lb6/f;

    new-instance v0, Ld6/d$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ld6/d$b;-><init>(Ld6/d$a;)V

    sput-object v0, Ld6/d;->h:Ld6/d$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ld6/d;->a:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ld6/d;->b:Ljava/util/Map;

    sget-object v0, Ld6/d;->e:Lb6/d;

    iput-object v0, p0, Ld6/d;->c:Lb6/d;

    const/4 v0, 0x0

    iput-boolean v0, p0, Ld6/d;->d:Z

    const-class v0, Ljava/lang/String;

    sget-object v1, Ld6/d;->f:Lb6/f;

    invoke-virtual {p0, v0, v1}, Ld6/d;->p(Ljava/lang/Class;Lb6/f;)Ld6/d;

    const-class v0, Ljava/lang/Boolean;

    sget-object v1, Ld6/d;->g:Lb6/f;

    invoke-virtual {p0, v0, v1}, Ld6/d;->p(Ljava/lang/Class;Lb6/f;)Ld6/d;

    const-class v0, Ljava/util/Date;

    sget-object v1, Ld6/d;->h:Ld6/d$b;

    invoke-virtual {p0, v0, v1}, Ld6/d;->p(Ljava/lang/Class;Lb6/f;)Ld6/d;

    return-void
.end method

.method public static synthetic b(Ljava/lang/Object;Lb6/e;)V
    .locals 0

    invoke-static {p0, p1}, Ld6/d;->l(Ljava/lang/Object;Lb6/e;)V

    return-void
.end method

.method public static synthetic c(Ljava/lang/String;Lb6/g;)V
    .locals 0

    invoke-static {p0, p1}, Ld6/d;->m(Ljava/lang/String;Lb6/g;)V

    return-void
.end method

.method public static synthetic d(Ljava/lang/Boolean;Lb6/g;)V
    .locals 0

    invoke-static {p0, p1}, Ld6/d;->n(Ljava/lang/Boolean;Lb6/g;)V

    return-void
.end method

.method static synthetic e(Ld6/d;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Ld6/d;->a:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic f(Ld6/d;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Ld6/d;->b:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic g(Ld6/d;)Lb6/d;
    .locals 0

    iget-object p0, p0, Ld6/d;->c:Lb6/d;

    return-object p0
.end method

.method static synthetic h(Ld6/d;)Z
    .locals 0

    iget-boolean p0, p0, Ld6/d;->d:Z

    return p0
.end method

.method private static synthetic l(Ljava/lang/Object;Lb6/e;)V
    .locals 2

    new-instance p1, Lb6/b;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Couldn\'t find encoder for type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lb6/b;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static synthetic m(Ljava/lang/String;Lb6/g;)V
    .locals 0

    invoke-interface {p1, p0}, Lb6/g;->d(Ljava/lang/String;)Lb6/g;

    return-void
.end method

.method private static synthetic n(Ljava/lang/Boolean;Lb6/g;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-interface {p1, p0}, Lb6/g;->e(Z)Lb6/g;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Class;Lb6/d;)Lc6/b;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ld6/d;->o(Ljava/lang/Class;Lb6/d;)Ld6/d;

    move-result-object p1

    return-object p1
.end method

.method public i()Lb6/a;
    .locals 1

    new-instance v0, Ld6/d$a;

    invoke-direct {v0, p0}, Ld6/d$a;-><init>(Ld6/d;)V

    return-object v0
.end method

.method public j(Lc6/a;)Ld6/d;
    .locals 0

    invoke-interface {p1, p0}, Lc6/a;->a(Lc6/b;)V

    return-object p0
.end method

.method public k(Z)Ld6/d;
    .locals 0

    iput-boolean p1, p0, Ld6/d;->d:Z

    return-object p0
.end method

.method public o(Ljava/lang/Class;Lb6/d;)Ld6/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lb6/d<",
            "-TT;>;)",
            "Ld6/d;"
        }
    .end annotation

    iget-object v0, p0, Ld6/d;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Ld6/d;->b:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public p(Ljava/lang/Class;Lb6/f;)Ld6/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lb6/f<",
            "-TT;>;)",
            "Ld6/d;"
        }
    .end annotation

    iget-object v0, p0, Ld6/d;->b:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Ld6/d;->a:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method
