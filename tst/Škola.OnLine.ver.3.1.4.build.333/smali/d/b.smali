.class public Ld/b;
.super Ld/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ld/a<",
        "Ljava/lang/String;",
        "Ljava/util/List<",
        "Landroid/net/Uri;",
        ">;>;"
    }
.end annotation


# static fields
.field public static final a:Ld/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ld/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ld/b$a;-><init>(Ls9/g;)V

    sput-object v0, Ld/b;->a:Ld/b$a;

    return-void
.end method
