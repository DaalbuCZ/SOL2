.class La5/m$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La5/m$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La5/m;->e(La5/c;)La5/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:La5/c;


# direct methods
.method constructor <init>(La5/c;)V
    .locals 0

    iput-object p1, p0, La5/m$a;->a:La5/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(La5/m;Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 0

    invoke-virtual {p0, p1, p2}, La5/m$a;->b(La5/m;Ljava/lang/CharSequence;)La5/m$b;

    move-result-object p1

    return-object p1
.end method

.method public b(La5/m;Ljava/lang/CharSequence;)La5/m$b;
    .locals 1

    new-instance v0, La5/m$a$a;

    invoke-direct {v0, p0, p1, p2}, La5/m$a$a;-><init>(La5/m$a;La5/m;Ljava/lang/CharSequence;)V

    return-object v0
.end method
