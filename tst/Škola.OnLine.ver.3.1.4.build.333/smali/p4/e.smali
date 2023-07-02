.class public final Lp4/e;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Lp4/b;

.field private static volatile b:Lp4/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lp4/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp4/d;-><init>(Lp4/c;)V

    sput-object v0, Lp4/e;->a:Lp4/b;

    sput-object v0, Lp4/e;->b:Lp4/b;

    return-void
.end method

.method public static a()Lp4/b;
    .locals 1

    sget-object v0, Lp4/e;->b:Lp4/b;

    return-object v0
.end method
