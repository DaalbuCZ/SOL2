.class public Ly0/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp0/f;


# static fields
.field private static final d:Ljava/lang/String;


# instance fields
.field private final a:Lz0/a;

.field final b:Lw0/a;

.field final c:Lx0/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "WMFgUpdater"

    invoke-static {v0}, Lp0/j;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ly0/l;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroidx/work/impl/WorkDatabase;Lw0/a;Lz0/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ly0/l;->b:Lw0/a;

    iput-object p3, p0, Ly0/l;->a:Lz0/a;

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->B()Lx0/q;

    move-result-object p1

    iput-object p1, p0, Ly0/l;->c:Lx0/q;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/util/UUID;Lp0/e;)Lj5/a;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/UUID;",
            "Lp0/e;",
            ")",
            "Lj5/a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Landroidx/work/impl/utils/futures/c;->t()Landroidx/work/impl/utils/futures/c;

    move-result-object v6

    iget-object v7, p0, Ly0/l;->a:Lz0/a;

    new-instance v8, Ly0/l$a;

    move-object v0, v8

    move-object v1, p0

    move-object v2, v6

    move-object v3, p2

    move-object v4, p3

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Ly0/l$a;-><init>(Ly0/l;Landroidx/work/impl/utils/futures/c;Ljava/util/UUID;Lp0/e;Landroid/content/Context;)V

    invoke-interface {v7, v8}, Lz0/a;->b(Ljava/lang/Runnable;)V

    return-object v6
.end method
