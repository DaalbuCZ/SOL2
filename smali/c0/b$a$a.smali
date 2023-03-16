.class Lc0/b$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/database/DatabaseErrorHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc0/b$a;-><init>(Landroid/content/Context;Ljava/lang/String;[Lc0/a;Lb0/c$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb0/c$a;

.field final synthetic b:[Lc0/a;


# direct methods
.method constructor <init>(Lb0/c$a;[Lc0/a;)V
    .locals 0

    iput-object p1, p0, Lc0/b$a$a;->a:Lb0/c$a;

    iput-object p2, p0, Lc0/b$a$a;->b:[Lc0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCorruption(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    iget-object v0, p0, Lc0/b$a$a;->a:Lb0/c$a;

    iget-object v1, p0, Lc0/b$a$a;->b:[Lc0/a;

    invoke-static {v1, p1}, Lc0/b$a;->b([Lc0/a;Landroid/database/sqlite/SQLiteDatabase;)Lc0/a;

    move-result-object p1

    invoke-virtual {v0, p1}, Lb0/c$a;->c(Lb0/b;)V

    return-void
.end method
