.class Li5/b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li5/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li5/b;->d(Ljava/lang/String;Li5/a$b;)Li5/a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Li5/b;


# direct methods
.method constructor <init>(Li5/b;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Li5/b$a;->b:Li5/b;

    iput-object p2, p0, Li5/b$a;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
