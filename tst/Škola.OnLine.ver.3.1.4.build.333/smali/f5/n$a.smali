.class Lf5/n$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf5/n$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf5/n;->e(Lf5/c;)Lf5/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lf5/c;


# direct methods
.method constructor <init>(Lf5/c;)V
    .locals 0

    iput-object p1, p0, Lf5/n$a;->a:Lf5/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lf5/n;Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lf5/n$a;->b(Lf5/n;Ljava/lang/CharSequence;)Lf5/n$b;

    move-result-object p1

    return-object p1
.end method

.method public b(Lf5/n;Ljava/lang/CharSequence;)Lf5/n$b;
    .locals 1

    new-instance v0, Lf5/n$a$a;

    invoke-direct {v0, p0, p1, p2}, Lf5/n$a$a;-><init>(Lf5/n$a;Lf5/n;Ljava/lang/CharSequence;)V

    return-object v0
.end method
