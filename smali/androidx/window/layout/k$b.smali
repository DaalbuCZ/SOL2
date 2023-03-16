.class public final Landroidx/window/layout/k$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/window/layout/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/window/layout/k$b$a;
    }
.end annotation


# static fields
.field public static final b:Landroidx/window/layout/k$b$a;

.field private static final c:Landroidx/window/layout/k$b;

.field private static final d:Landroidx/window/layout/k$b;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/window/layout/k$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/window/layout/k$b$a;-><init>(Lk9/g;)V

    sput-object v0, Landroidx/window/layout/k$b;->b:Landroidx/window/layout/k$b$a;

    new-instance v0, Landroidx/window/layout/k$b;

    const-string v1, "FOLD"

    invoke-direct {v0, v1}, Landroidx/window/layout/k$b;-><init>(Ljava/lang/String;)V

    sput-object v0, Landroidx/window/layout/k$b;->c:Landroidx/window/layout/k$b;

    new-instance v0, Landroidx/window/layout/k$b;

    const-string v1, "HINGE"

    invoke-direct {v0, v1}, Landroidx/window/layout/k$b;-><init>(Ljava/lang/String;)V

    sput-object v0, Landroidx/window/layout/k$b;->d:Landroidx/window/layout/k$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/window/layout/k$b;->a:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic a()Landroidx/window/layout/k$b;
    .locals 1

    sget-object v0, Landroidx/window/layout/k$b;->c:Landroidx/window/layout/k$b;

    return-object v0
.end method

.method public static final synthetic b()Landroidx/window/layout/k$b;
    .locals 1

    sget-object v0, Landroidx/window/layout/k$b;->d:Landroidx/window/layout/k$b;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/window/layout/k$b;->a:Ljava/lang/String;

    return-object v0
.end method
