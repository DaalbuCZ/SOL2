.class public final Landroidx/window/layout/s;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/window/layout/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/window/layout/s$a;
    }
.end annotation


# static fields
.field public static final d:Landroidx/window/layout/s$a;


# instance fields
.field private final b:Landroidx/window/layout/x;

.field private final c:Landroidx/window/layout/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/window/layout/s$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/window/layout/s$a;-><init>(Lk9/g;)V

    sput-object v0, Landroidx/window/layout/s;->d:Landroidx/window/layout/s$a;

    return-void
.end method

.method public constructor <init>(Landroidx/window/layout/x;Landroidx/window/layout/p;)V
    .locals 1

    const-string v0, "windowMetricsCalculator"

    invoke-static {p1, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "windowBackend"

    invoke-static {p2, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/window/layout/s;->b:Landroidx/window/layout/x;

    iput-object p2, p0, Landroidx/window/layout/s;->c:Landroidx/window/layout/p;

    return-void
.end method

.method public static final synthetic b(Landroidx/window/layout/s;)Landroidx/window/layout/p;
    .locals 0

    iget-object p0, p0, Landroidx/window/layout/s;->c:Landroidx/window/layout/p;

    return-object p0
.end method


# virtual methods
.method public a(Landroid/app/Activity;)Lu9/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            ")",
            "Lu9/b<",
            "Landroidx/window/layout/v;",
            ">;"
        }
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/window/layout/s$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Landroidx/window/layout/s$b;-><init>(Landroidx/window/layout/s;Landroid/app/Activity;Lb9/d;)V

    invoke-static {v0}, Lu9/d;->a(Lj9/p;)Lu9/b;

    move-result-object p1

    return-object p1
.end method
