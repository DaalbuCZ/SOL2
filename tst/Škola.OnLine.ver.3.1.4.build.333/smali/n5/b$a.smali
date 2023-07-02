.class Ln5/b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ln5/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln5/b;->a(Ljava/lang/String;Ln5/a$b;)Ln5/a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ln5/b;


# direct methods
.method constructor <init>(Ln5/b;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ln5/b$a;->b:Ln5/b;

    iput-object p2, p0, Ln5/b$a;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
