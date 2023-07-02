.class public final Lr4/h;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Lr4/e;

.field private static volatile b:Lr4/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr4/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr4/g;-><init>(Lr4/f;)V

    sput-object v0, Lr4/h;->a:Lr4/e;

    sput-object v0, Lr4/h;->b:Lr4/e;

    return-void
.end method

.method public static a()Lr4/e;
    .locals 1

    sget-object v0, Lr4/h;->b:Lr4/e;

    return-object v0
.end method
