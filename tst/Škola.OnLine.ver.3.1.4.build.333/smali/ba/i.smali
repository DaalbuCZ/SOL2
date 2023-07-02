.class public final Lba/i;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lba/i$c;,
        Lba/i$a;,
        Lba/i$b;
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
.field public static final a:Lba/i$b;

.field private static final b:Lba/i$c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lba/i$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lba/i$b;-><init>(Ls9/g;)V

    sput-object v0, Lba/i;->a:Lba/i$b;

    new-instance v0, Lba/i$c;

    invoke-direct {v0}, Lba/i$c;-><init>()V

    sput-object v0, Lba/i;->b:Lba/i$c;

    return-void
.end method

.method public static final synthetic a()Lba/i$c;
    .locals 1

    sget-object v0, Lba/i;->b:Lba/i$c;

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
