.class public final Lk4/e;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Lk4/b;

.field private static volatile b:Lk4/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lk4/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lk4/d;-><init>(Lk4/c;)V

    sput-object v0, Lk4/e;->a:Lk4/b;

    sput-object v0, Lk4/e;->b:Lk4/b;

    return-void
.end method

.method public static a()Lk4/b;
    .locals 1

    sget-object v0, Lk4/e;->b:Lk4/b;

    return-object v0
.end method
