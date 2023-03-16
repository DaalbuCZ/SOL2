.class public final Lt9/i;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt9/i$c;,
        Lt9/i$a;,
        Lt9/i$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final a:Lt9/i$b;

.field private static final b:Lt9/i$c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lt9/i$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lt9/i$b;-><init>(Lk9/g;)V

    sput-object v0, Lt9/i;->a:Lt9/i$b;

    new-instance v0, Lt9/i$c;

    invoke-direct {v0}, Lt9/i$c;-><init>()V

    sput-object v0, Lt9/i;->b:Lt9/i$c;

    return-void
.end method

.method public static final synthetic a()Lt9/i$c;
    .locals 1

    sget-object v0, Lt9/i;->b:Lt9/i$c;

    return-object v0
.end method

.method public static b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    return-object p0
.end method
